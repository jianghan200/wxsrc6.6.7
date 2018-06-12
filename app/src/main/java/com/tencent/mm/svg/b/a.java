package com.tencent.mm.svg.b;

import java.lang.reflect.Field;

public final class a<T>
{
  private String classname;
  private boolean dfF;
  public Field dfG;
  private String fieldName;
  public Object obj;
  
  public a(Object paramObject, String paramString)
  {
    if (paramObject == null) {
      throw new IllegalArgumentException("obj cannot be null");
    }
    this.obj = paramObject;
    this.fieldName = paramString;
    this.classname = null;
  }
  
  public final T get()
  {
    prepare();
    if (this.dfG == null) {
      throw new NoSuchFieldException();
    }
    try
    {
      Object localObject = this.dfG.get(this.obj);
      return (T)localObject;
    }
    catch (ClassCastException localClassCastException)
    {
      throw new IllegalArgumentException("unable to cast object");
    }
  }
  
  public final void prepare()
  {
    if (this.dfF) {
      return;
    }
    this.dfF = true;
    Class localClass = this.obj.getClass();
    while (localClass != null) {
      try
      {
        Field localField1 = localClass.getDeclaredField(this.fieldName);
        localField1.setAccessible(true);
        this.dfG = localField1;
        return;
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          try
          {
            if ((this.classname != null) && (!this.classname.equals("")))
            {
              Field[] arrayOfField = localClass.getDeclaredFields();
              int j = arrayOfField.length;
              i = 0;
              if (i < j)
              {
                Field localField2 = arrayOfField[i];
                if (!localField2.getType().getName().equals(this.classname)) {
                  continue;
                }
                localField2.setAccessible(true);
                this.dfG = localField2;
              }
            }
          }
          catch (Exception localException2)
          {
            int i;
            continue;
          }
          localClass = localClass.getSuperclass();
          break;
          i += 1;
        }
      }
      finally
      {
        localClass.getSuperclass();
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/svg/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */