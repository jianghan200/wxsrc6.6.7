package b.c.b;

import b.a;
import b.k;
import java.util.Arrays;
import java.util.List;

public class e
{
  public static void adK(String paramString)
  {
    throw ((k)l(new k("lateinit property " + paramString + " has not been initialized")));
  }
  
  static <T extends Throwable> T b(T paramT, String paramString)
  {
    StackTraceElement[] arrayOfStackTraceElement = paramT.getStackTrace();
    int k = arrayOfStackTraceElement.length;
    int j = -1;
    int i = 0;
    while (i < k)
    {
      if (paramString.equals(arrayOfStackTraceElement[i].getClassName())) {
        j = i;
      }
      i += 1;
    }
    paramString = Arrays.asList(arrayOfStackTraceElement).subList(j + 1, k);
    paramT.setStackTrace((StackTraceElement[])paramString.toArray(new StackTraceElement[paramString.size()]));
    return paramT;
  }
  
  public static void cJM()
  {
    throw ((a)l(new a()));
  }
  
  public static void h(Object paramObject, String paramString)
  {
    if (paramObject == null) {
      throw ((IllegalStateException)l(new IllegalStateException(paramString + " must not be null")));
    }
  }
  
  public static void i(Object paramObject, String paramString)
  {
    if (paramObject == null)
    {
      Object localObject = Thread.currentThread().getStackTrace()[3];
      paramObject = ((StackTraceElement)localObject).getClassName();
      localObject = ((StackTraceElement)localObject).getMethodName();
      throw ((IllegalArgumentException)l(new IllegalArgumentException("Parameter specified as non-null is null: method " + (String)paramObject + "." + (String)localObject + ", parameter " + paramString)));
    }
  }
  
  public static boolean i(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null) {
      return paramObject2 == null;
    }
    return paramObject1.equals(paramObject2);
  }
  
  private static <T extends Throwable> T l(T paramT)
  {
    return b(paramT, e.class.getName());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/b/c/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */