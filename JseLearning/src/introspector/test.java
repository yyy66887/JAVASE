package introspector;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;

public class test {

	public static void main(String[] args) throws Exception {
		BeanInfo bi = Introspector.getBeanInfo(Person.class);
		PropertyDescriptor[] p = bi.getPropertyDescriptors();
		System.out.println(p.length);
		for(PropertyDescriptor a :p){
			System.out.println(a.getName());
		}
		Person per = new Person();
		PropertyDescriptor o = new PropertyDescriptor("name", Person.class);
		Method m = o.getReadMethod();
		String name = (String)m.invoke(per);
		System.out.println(name);
		m = o.getWriteMethod();
		m.invoke(per,"杨祎玥");
		System.out.println(per.getName());
		String s = BeanUtils.getProperty(per, "name");
		System.out.println(s);
		BeanUtils.setProperty(per, "age", 30);
		String ss = BeanUtils.getProperty(per, "age");
		System.out.println(ss);
//		ConvertUtils.register(new Converter() {
//			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//			public Object convert(Class arg0, Object arg1) {
//				if(arg1 instanceof String){
//					String s = (String) arg1;
//					Date d;
//					try {
//						d = df.parse(s);
//						return d;
//					} catch (ParseException e) {
//						e.printStackTrace();
//					}
//				}else{
//					Date d = (Date) arg1;
//					return df.format(d);
//				}
//				return null;
//			}
//		}, Date.class);
		ConvertUtils.register(new DateLocaleConverter(), Date.class);
		BeanUtils.setProperty(per, "birth", "1992-12-20");
		System.out.println(per.getBirth());
		String sss =  BeanUtils.getProperty(per, "birth");
		System.out.println(sss);
		
		Map map = new HashMap();
		map.put("name", "一样一样");
		map.put("age", "62");
		map.put("birth", "1993-9-9");
		
		BeanUtils.populate(per, map);
		System.out.println(per);
	
	}

}
