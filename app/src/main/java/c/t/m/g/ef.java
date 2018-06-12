package c.t.m.g;

import java.util.Iterator;

public final class ef
{
  private final String a;
  
  ef(String paramString)
  {
    this.a = paramString;
  }
  
  final StringBuilder a(StringBuilder paramStringBuilder, Iterator<?> paramIterator)
  {
    Object localObject;
    if (paramIterator.hasNext())
    {
      localObject = paramIterator.next();
      if (localObject != null) {
        paramStringBuilder.append(localObject.toString());
      }
    }
    while (paramIterator.hasNext())
    {
      localObject = paramIterator.next();
      if (localObject != null)
      {
        paramStringBuilder.append(this.a);
        paramStringBuilder.append(localObject.toString());
      }
    }
    return paramStringBuilder;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/c/t/m/g/ef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */