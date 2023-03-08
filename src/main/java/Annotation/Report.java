package Annotation;

    import java.lang.annotation.ElementType;
	import java.lang.annotation.Retention;
	import java.lang.annotation.RetentionPolicy;
	import java.lang.annotation.Target;

	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	/**
	 * annotation developed 2 things author & category 
	 * author is mandatory ,category is not mandatory bydefault it will take as regression 
	 * @author Subhas bhosale
	 *
	 */
	public @interface Report 
	{
		public String author() default "unknown";

		public String[] category() default "regression";
	}
//String[] --> to give multiple names 