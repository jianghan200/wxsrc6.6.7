package com.tencent.tinker.c.a;

import com.tencent.tinker.a.a.i.e;
import com.tencent.tinker.a.a.r;
import com.tencent.tinker.a.a.s;
import com.tencent.tinker.a.a.t;
import com.tencent.tinker.a.a.t.a;
import com.tencent.tinker.a.a.u;
import com.tencent.tinker.c.a.a.a.j;
import com.tencent.tinker.c.a.a.a.l;
import com.tencent.tinker.c.a.a.a.m;
import com.tencent.tinker.c.a.a.a.o;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class a
{
  private final com.tencent.tinker.a.a.i vqf;
  private final com.tencent.tinker.a.a.i vqg;
  private final com.tencent.tinker.c.a.b.a vqh;
  private final com.tencent.tinker.c.a.c.c vqi;
  private com.tencent.tinker.c.a.a.a.i<s> vqj;
  private com.tencent.tinker.c.a.a.a.i<Integer> vqk;
  private com.tencent.tinker.c.a.a.a.i<r> vql;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.n> vqm;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.p> vqn;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.f> vqo;
  private com.tencent.tinker.c.a.a.a.i<u> vqp;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.c> vqq;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.b> vqr;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.e> vqs;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.g> vqt;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.h> vqu;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.a> vqv;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.k> vqw;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.d> vqx;
  
  private a(com.tencent.tinker.a.a.i parami, com.tencent.tinker.c.a.b.a parama)
  {
    this.vqf = parami;
    this.vqh = parama;
    this.vqg = new com.tencent.tinker.a.a.i(parama.vrf);
    this.vqi = new com.tencent.tinker.c.a.c.c();
  }
  
  public a(InputStream paramInputStream1, InputStream paramInputStream2)
  {
    this(new com.tencent.tinker.a.a.i(paramInputStream1), new com.tencent.tinker.c.a.b.a(paramInputStream2));
  }
  
  public final void a(OutputStream paramOutputStream)
  {
    int j = 0;
    Object localObject1 = this.vqf.mS(false);
    if (localObject1 == null) {
      throw new IOException("failed to compute old dex's signature.");
    }
    if (this.vqh == null) {
      throw new IllegalArgumentException("patch file is null.");
    }
    Object localObject2 = this.vqh.vry;
    if (com.tencent.tinker.a.a.b.c.l((byte[])localObject1, (byte[])localObject2) != 0) {
      throw new IOException(String.format("old dex signature mismatch! expected: %s, actual: %s", new Object[] { Arrays.toString((byte[])localObject1), Arrays.toString((byte[])localObject2) }));
    }
    localObject1 = this.vqg.voQ;
    ((t)localObject1).vpk.off = 0;
    ((t)localObject1).vpk.size = 1;
    ((t)localObject1).vpr.size = 1;
    ((t)localObject1).vpl.off = this.vqh.vrh;
    ((t)localObject1).vpm.off = this.vqh.vri;
    ((t)localObject1).vps.off = this.vqh.vro;
    ((t)localObject1).vpn.off = this.vqh.vrj;
    ((t)localObject1).vpo.off = this.vqh.vrk;
    ((t)localObject1).vpp.off = this.vqh.vrl;
    ((t)localObject1).vpq.off = this.vqh.vrm;
    ((t)localObject1).vpr.off = this.vqh.vrn;
    ((t)localObject1).vpx.off = this.vqh.vrt;
    ((t)localObject1).vpz.off = this.vqh.vrv;
    ((t)localObject1).vpu.off = this.vqh.vrq;
    ((t)localObject1).vpt.off = this.vqh.vrp;
    ((t)localObject1).vpB.off = this.vqh.vrx;
    ((t)localObject1).vpA.off = this.vqh.vrw;
    ((t)localObject1).vpy.off = this.vqh.vru;
    ((t)localObject1).vpw.off = this.vqh.vrs;
    ((t)localObject1).vpv.off = this.vqh.vrr;
    ((t)localObject1).fileSize = this.vqh.vrf;
    Arrays.sort(((t)localObject1).vpC);
    ((t)localObject1).cGM();
    this.vqj = new com.tencent.tinker.c.a.a.a.n(this.vqh, this.vqf, this.vqg, this.vqi);
    this.vqk = new o(this.vqh, this.vqf, this.vqg, this.vqi);
    this.vql = new l(this.vqh, this.vqf, this.vqg, this.vqi);
    this.vqm = new j(this.vqh, this.vqf, this.vqg, this.vqi);
    this.vqn = new com.tencent.tinker.c.a.a.a.k(this.vqh, this.vqf, this.vqg, this.vqi);
    this.vqo = new com.tencent.tinker.c.a.a.a.f(this.vqh, this.vqf, this.vqg, this.vqi);
    this.vqp = new com.tencent.tinker.c.a.a.a.p(this.vqh, this.vqf, this.vqg, this.vqi);
    this.vqq = new com.tencent.tinker.c.a.a.a.b(this.vqh, this.vqf, this.vqg, this.vqi);
    this.vqr = new com.tencent.tinker.c.a.a.a.c(this.vqh, this.vqf, this.vqg, this.vqi);
    this.vqs = new com.tencent.tinker.c.a.a.a.e(this.vqh, this.vqf, this.vqg, this.vqi);
    this.vqt = new com.tencent.tinker.c.a.a.a.g(this.vqh, this.vqf, this.vqg, this.vqi);
    this.vqu = new com.tencent.tinker.c.a.a.a.h(this.vqh, this.vqf, this.vqg, this.vqi);
    this.vqv = new com.tencent.tinker.c.a.a.a.a(this.vqh, this.vqf, this.vqg, this.vqi);
    this.vqw = new m(this.vqh, this.vqf, this.vqg, this.vqi);
    this.vqx = new com.tencent.tinker.c.a.a.a.d(this.vqh, this.vqf, this.vqg, this.vqi);
    this.vqj.execute();
    this.vqk.execute();
    this.vqp.execute();
    this.vql.execute();
    this.vqm.execute();
    this.vqn.execute();
    this.vqv.execute();
    this.vqr.execute();
    this.vqq.execute();
    this.vqx.execute();
    this.vqu.execute();
    this.vqt.execute();
    this.vqs.execute();
    this.vqw.execute();
    this.vqo.execute();
    localObject2 = this.vqg.Hu(((t)localObject1).vpk.off);
    ((i.e)localObject2).write(("dex\n" + "035" + "\000").getBytes("UTF-8"));
    ((i.e)localObject2).writeInt(((t)localObject1).epK);
    ((i.e)localObject2).write(((t)localObject1).kMN);
    ((i.e)localObject2).writeInt(((t)localObject1).fileSize);
    ((i.e)localObject2).writeInt(112);
    ((i.e)localObject2).writeInt(305419896);
    ((i.e)localObject2).writeInt(((t)localObject1).vpD);
    ((i.e)localObject2).writeInt(((t)localObject1).vpE);
    ((i.e)localObject2).writeInt(((t)localObject1).vpr.off);
    ((i.e)localObject2).writeInt(((t)localObject1).vpl.size);
    if (((t)localObject1).vpl.exists())
    {
      i = ((t)localObject1).vpl.off;
      ((i.e)localObject2).writeInt(i);
      ((i.e)localObject2).writeInt(((t)localObject1).vpm.size);
      if (!((t)localObject1).vpm.exists()) {
        break label1360;
      }
      i = ((t)localObject1).vpm.off;
      label1125:
      ((i.e)localObject2).writeInt(i);
      ((i.e)localObject2).writeInt(((t)localObject1).vpn.size);
      if (!((t)localObject1).vpn.exists()) {
        break label1365;
      }
      i = ((t)localObject1).vpn.off;
      label1164:
      ((i.e)localObject2).writeInt(i);
      ((i.e)localObject2).writeInt(((t)localObject1).vpo.size);
      if (!((t)localObject1).vpo.exists()) {
        break label1370;
      }
      i = ((t)localObject1).vpo.off;
      label1203:
      ((i.e)localObject2).writeInt(i);
      ((i.e)localObject2).writeInt(((t)localObject1).vpp.size);
      if (!((t)localObject1).vpp.exists()) {
        break label1375;
      }
    }
    label1360:
    label1365:
    label1370:
    label1375:
    for (int i = ((t)localObject1).vpp.off;; i = 0)
    {
      ((i.e)localObject2).writeInt(i);
      ((i.e)localObject2).writeInt(((t)localObject1).vpq.size);
      i = j;
      if (((t)localObject1).vpq.exists()) {
        i = ((t)localObject1).vpq.off;
      }
      ((i.e)localObject2).writeInt(i);
      ((i.e)localObject2).writeInt(((t)localObject1).vpF);
      ((i.e)localObject2).writeInt(((t)localObject1).vpG);
      ((t)localObject1).b(this.vqg.Hu(((t)localObject1).vpr.off));
      this.vqg.cGn();
      paramOutputStream.write(this.vqg.aig.array());
      paramOutputStream.flush();
      return;
      i = 0;
      break;
      i = 0;
      break label1125;
      i = 0;
      break label1164;
      i = 0;
      break label1203;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tinker/c/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */