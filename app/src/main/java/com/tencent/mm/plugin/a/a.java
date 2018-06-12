package com.tencent.mm.plugin.a;

public class a
{
  public static final int ajB;
  public static final int ajC;
  public static final int ajD;
  public static final int ajE;
  public static final int ajF;
  public static final int ajG;
  public static final int ajH;
  public static final int ajI;
  public static final int ajJ;
  public static final int ajK;
  public static final int ajL;
  public static final int ajM;
  public static final int ajN;
  public static final int ajO;
  public static final int ajP;
  public static final int ajQ;
  public static final int ajR;
  public static final int ajS;
  public static final int ajT;
  public static final int ajU;
  public static final int ajV;
  public static final int ajW;
  public static final int ajX;
  public static final int ajY;
  public static final int ajZ;
  public static final int ajo = c.aE("ftyp");
  public static final int ajp = c.aE("avc1");
  public static final int ajq = c.aE("avc3");
  public static final int ajr = c.aE("hvc1");
  public static final int ajs = c.aE("hev1");
  public static final int ajt = c.aE("s263");
  public static final int aju = c.aE("d263");
  public static final int ajv = c.aE("mdat");
  public static final int ajw = c.aE("mp4a");
  public static final int ajy = c.aE("wave");
  public static final int akA = c.aE("stts");
  public static final int akB = c.aE("stss");
  public static final int akC = c.aE("ctts");
  public static final int akD = c.aE("stsc");
  public static final int akE = c.aE("stsz");
  public static final int akG = c.aE("stco");
  public static final int akH = c.aE("co64");
  public static final int akI = c.aE("tx3g");
  public static final int akJ = c.aE("wvtt");
  public static final int akK = c.aE("stpp");
  public static final int akM = c.aE("samr");
  public static final int akN = c.aE("sawb");
  public static final int akO = c.aE("udta");
  public static final int akP = c.aE("meta");
  public static final int akQ = c.aE("ilst");
  public static final int akR = c.aE("mean");
  public static final int akS = c.aE("name");
  public static final int akT = c.aE("data");
  public static final int aka;
  public static final int akc;
  public static final int akd;
  public static final int ake;
  public static final int akf;
  public static final int akg;
  public static final int akh;
  public static final int aki;
  public static final int akj;
  public static final int akk;
  public static final int akl;
  public static final int akm;
  public static final int akn;
  public static final int ako;
  public static final int akp;
  public static final int akq;
  public static final int akr;
  public static final int aku;
  public static final int akv;
  public static final int akw;
  public static final int akx;
  public static final int aky;
  public static final int akz;
  public static final int eyt = c.aE("----");
  private int eyu;
  private long eyv;
  public long eyw;
  private int type;
  
  static
  {
    ajB = c.aE("ac-3");
    ajC = c.aE("dac3");
    ajD = c.aE("ec-3");
    ajE = c.aE("dec3");
    ajF = c.aE("dtsc");
    ajG = c.aE("dtsh");
    ajH = c.aE("dtsl");
    ajI = c.aE("dtse");
    ajJ = c.aE("ddts");
    ajK = c.aE("tfdt");
    ajL = c.aE("tfhd");
    ajM = c.aE("trex");
    ajN = c.aE("trun");
    ajO = c.aE("sidx");
    ajP = c.aE("moov");
    ajQ = c.aE("mvhd");
    ajR = c.aE("trak");
    ajS = c.aE("mdia");
    ajT = c.aE("minf");
    ajU = c.aE("stbl");
    ajV = c.aE("avcC");
    ajW = c.aE("hvcC");
    ajX = c.aE("esds");
    ajY = c.aE("moof");
    ajZ = c.aE("traf");
    aka = c.aE("mvex");
    akc = c.aE("tkhd");
    akd = c.aE("edts");
    ake = c.aE("elst");
    akf = c.aE("mdhd");
    akg = c.aE("hdlr");
    akh = c.aE("stsd");
    aki = c.aE("pssh");
    akj = c.aE("sinf");
    akk = c.aE("schm");
    akl = c.aE("schi");
    akm = c.aE("tenc");
    akn = c.aE("encv");
    ako = c.aE("enca");
    akp = c.aE("frma");
    akq = c.aE("saiz");
    akr = c.aE("saio");
    aku = c.aE("uuid");
    akv = c.aE("senc");
    akw = c.aE("pasp");
    akx = c.aE("TTML");
    aky = c.aE("vmhd");
    akz = c.aE("mp4v");
  }
  
  public a(int paramInt1, long paramLong1, int paramInt2, long paramLong2)
  {
    this.eyu = paramInt1;
    this.eyw = paramLong1;
    this.type = paramInt2;
    this.eyv = paramLong2;
  }
  
  public final boolean VJ()
  {
    return this.type == ajP;
  }
  
  public final boolean VK()
  {
    return this.eyu == 0;
  }
  
  public final long VL()
  {
    return this.eyw + getSize();
  }
  
  public final long getSize()
  {
    if (this.eyv > 0L) {
      return this.eyv;
    }
    return this.eyu;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Atom{atomSize=").append(this.eyu).append(", atomLargeSize=").append(this.eyv).append(", type=");
    int i = this.type;
    return new String(new byte[] { (byte)(i >> 24 & 0xFF), (byte)(i >> 16 & 0xFF), (byte)(i >> 8 & 0xFF), (byte)(i & 0xFF) }) + ", beginPos=" + this.eyw + '}';
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */