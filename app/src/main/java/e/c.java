package e;

import com.tencent.tencentmap.mapsdk.a.md;
import com.tencent.tencentmap.mapsdk.a.me;
import com.tencent.tencentmap.mapsdk.a.mf;

public final class c
  extends mf
{
  public String bvp = "";
  public String imei = "";
  public String srZ = "";
  public long uin = 0L;
  public String vHA = "";
  public String vHB = "";
  public long vHw = 0L;
  public int vHx = 0;
  public String vHy = "";
  public boolean vHz = true;
  public String version = "";
  public double x = 0.0D;
  public double y = 0.0D;
  
  public final void readFrom(md parammd)
  {
    this.vHw = parammd.a(this.vHw, 0, true);
    this.srZ = parammd.a(1, true);
    this.uin = parammd.a(this.uin, 2, true);
    this.vHx = parammd.a(this.vHx, 3, true);
    this.imei = parammd.a(4, false);
    this.x = parammd.a(this.x, 5, false);
    this.y = parammd.a(this.y, 6, false);
    this.vHy = parammd.a(7, false);
    this.version = parammd.a(8, false);
    this.vHz = parammd.a(this.vHz, 9, false);
    this.vHA = parammd.a(10, false);
    this.vHB = parammd.a(11, false);
    this.bvp = parammd.a(12, false);
  }
  
  public final void writeTo(me paramme)
  {
    paramme.a(this.vHw, 0);
    paramme.a(this.srZ, 1);
    paramme.a(this.uin, 2);
    paramme.a(this.vHx, 3);
    if (this.imei != null) {
      paramme.a(this.imei, 4);
    }
    paramme.a(this.x, 5);
    paramme.a(this.y, 6);
    if (this.vHy != null) {
      paramme.a(this.vHy, 7);
    }
    if (this.version != null) {
      paramme.a(this.version, 8);
    }
    paramme.a(this.vHz, 9);
    if (this.vHA != null) {
      paramme.a(this.vHA, 10);
    }
    if (this.vHB != null) {
      paramme.a(this.vHB, 11);
    }
    if (this.bvp != null) {
      paramme.a(this.bvp, 12);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */