package e;

import com.tencent.tencentmap.mapsdk.a.md;
import com.tencent.tencentmap.mapsdk.a.me;
import com.tencent.tencentmap.mapsdk.a.mf;
import java.util.ArrayList;

public final class a
  extends mf
{
  static ArrayList<Integer> a = new ArrayList();
  public ArrayList<Integer> vHt = null;
  public short vHu = 0;
  public short vHv = 0;
  
  static
  {
    a.add(Integer.valueOf(0));
  }
  
  public final void readFrom(md parammd)
  {
    this.vHt = ((ArrayList)parammd.a(a, 0, true));
    this.vHu = parammd.a(this.vHu, 1, true);
    this.vHv = parammd.a(this.vHv, 2, true);
  }
  
  public final void writeTo(me paramme)
  {
    paramme.a(this.vHt, 0);
    paramme.a(this.vHu, 1);
    paramme.a(this.vHv, 2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */