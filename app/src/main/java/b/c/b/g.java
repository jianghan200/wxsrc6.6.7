package b.c.b;

import b.e.d;

public abstract class g
  extends a
  implements d
{
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof g)) {
        break;
      }
      paramObject = (g)paramObject;
    } while ((cJJ().equals(((g)paramObject).cJJ())) && (getName().equals(((g)paramObject).getName())) && (cmO().equals(((g)paramObject).cmO())) && (e.i(cJH(), ((g)paramObject).cJH())));
    return false;
    if ((paramObject instanceof d)) {
      return paramObject.equals(cJI());
    }
    return false;
  }
  
  public int hashCode()
  {
    return (cJJ().hashCode() * 31 + getName().hashCode()) * 31 + cmO().hashCode();
  }
  
  public String toString()
  {
    b.e.a locala = cJI();
    if (locala != this) {
      return locala.toString();
    }
    return "property " + getName() + " (Kotlin reflection is not available)";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/b/c/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */