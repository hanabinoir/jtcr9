package jtcr9.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@Anno1()
@Anno2("Meta")
public class Meta {
	
	public static void callClassAnnotation() {
		Meta meta = new Meta();
		
		Annotation annos[] = meta.getClass().getAnnotations();
		System.out.println(meta.getClass()
				.getAnnotation(Anno2.class).value());
		for (Annotation a: annos)
			System.out.println(a);
		System.out.println();
	}

	@Anno1(str = "Testing", val = 1)
	@Anno2("Testing without params")
	@Maker
	public static void callAnnotation() {
		Meta meta = new Meta();
		
		// Obtain the annotation of this method
		// and display the values of the members.
		try {
			// Class object of this class
			Class<?> c = meta.getClass();
			
			// Method object of this method
			Method m = c.getMethod("callAnnotation");
			
			// Annotation for this class
			Anno1 anno = m.getAnnotation(Anno1.class);
			Anno2 description = m.getAnnotation(Anno2.class);
			
			System.out.println(anno.str() + 
					" " + anno.val() + 
					": " + description.value());
			if (m.isAnnotationPresent(Maker.class))
				System.out.println(m.getAnnotation(Maker.class));
			
			System.out.println();
		} catch (NoSuchMethodException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Anno1(str = "Testing", val = 2)
	@Anno2("Testing with two params")
	public static void callAnnotation(String str, int i) {
		Meta meta = new Meta();
		
		// Obtain the annotation of this method
		// and display the values of the members.
		try {
			// Method object of this method
			Method m = meta.getClass().getMethod("callAnnotation", 
					String.class, int.class);
			
			// Annotation for this class
			Anno1 anno = m.getAnnotation(Anno1.class);
			Anno2 description = m.getAnnotation(Anno2.class);
			Annotation annos[] = m.getAnnotations();
			
			System.out.println(anno.str() + 
					" " + anno.val() + 
					": " + description.value());
			
			for (Annotation a: annos)
				System.out.println(a);
			System.out.println();
		} catch (NoSuchMethodException e) {
			System.out.println(e.getMessage());
		}
	}
}
