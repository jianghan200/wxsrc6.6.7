package com.tencent.tencentmap.mapsdk.a;

final class ca<K, V>
{
  bz<K, V> a;
  bz<K, V> b;
  
  public final void a(bz<K, V> parambz)
  {
    if (parambz.c != null)
    {
      parambz.c.d = parambz.d;
      if (parambz.d == null) {
        break label63;
      }
      parambz.d.c = parambz.c;
    }
    label63:
    do
    {
      return;
      this.b = parambz.d;
      if (this.b == null) {
        break;
      }
      this.b.c = null;
      break;
      this.a = parambz.c;
    } while (this.a == null);
    this.a.d = null;
  }
  
  public final void b(bz<K, V> parambz)
  {
    if (this.a == null)
    {
      this.a = parambz;
      this.b = parambz;
      return;
    }
    parambz.c = this.a;
    this.a.d = parambz;
    this.a = parambz;
    this.a.d = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */