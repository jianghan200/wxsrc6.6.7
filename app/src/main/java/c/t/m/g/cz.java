package c.t.m.g;

public class cz
{
  private static cz e = null;
  float a = 0.0F;
  float b = 0.0F;
  float c = 100.0F;
  boolean d = false;
  
  public static cz a()
  {
    if (e == null) {}
    try
    {
      if (e == null) {
        e = new cz();
      }
      return e;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/c/t/m/g/cz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */