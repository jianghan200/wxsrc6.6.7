package com.tencent.c.c.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;

public final class b
  extends JceStruct
{
  static byte[] viV;
  static byte[] viW;
  static ArrayList<Integer> viX;
  static ArrayList<byte[]> viY;
  public int viC = 0;
  public byte[] viD = null;
  public String viE = "";
  public byte[] viF = null;
  public long viG = 0L;
  public String viH = "";
  public int viI = 0;
  public String viJ = "";
  public int viK = 0;
  public String viL = "";
  public int viM = 0;
  public int viN = 0;
  public int viO = 0;
  public ArrayList<Integer> viP = null;
  public int viQ = 0;
  public boolean viR = false;
  public int viS = 0;
  public int viT = 0;
  public ArrayList<byte[]> viU = null;
  
  static
  {
    byte[] arrayOfByte = (byte[])new byte[1];
    viV = arrayOfByte;
    ((byte[])arrayOfByte)[0] = 0;
    arrayOfByte = (byte[])new byte[1];
    viW = arrayOfByte;
    ((byte[])arrayOfByte)[0] = 0;
    viX = new ArrayList();
    viX.add(Integer.valueOf(0));
    viY = new ArrayList();
    arrayOfByte = (byte[])new byte[1];
    ((byte[])arrayOfByte)[0] = 0;
    viY.add(arrayOfByte);
  }
  
  public final JceStruct newInit()
  {
    return new b();
  }
  
  public final void readFrom(JceInputStream paramJceInputStream)
  {
    this.viC = paramJceInputStream.read(this.viC, 0, true);
    this.viD = ((byte[])paramJceInputStream.read(viV, 1, false));
    this.viE = paramJceInputStream.readString(2, false);
    this.viF = ((byte[])paramJceInputStream.read(viW, 3, false));
    this.viG = paramJceInputStream.read(this.viG, 4, false);
    this.viH = paramJceInputStream.readString(5, false);
    this.viI = paramJceInputStream.read(this.viI, 6, false);
    this.viJ = paramJceInputStream.readString(7, false);
    this.viK = paramJceInputStream.read(this.viK, 8, false);
    this.viL = paramJceInputStream.readString(9, false);
    this.viM = paramJceInputStream.read(this.viM, 10, false);
    this.viN = paramJceInputStream.read(this.viN, 11, false);
    this.viO = paramJceInputStream.read(this.viO, 12, false);
    this.viP = ((ArrayList)paramJceInputStream.read(viX, 13, false));
    this.viQ = paramJceInputStream.read(this.viQ, 14, false);
    this.viR = paramJceInputStream.read(this.viR, 15, false);
    this.viS = paramJceInputStream.read(this.viS, 16, false);
    this.viT = paramJceInputStream.read(this.viT, 17, false);
    this.viU = ((ArrayList)paramJceInputStream.read(viY, 18, false));
  }
  
  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.viC, 0);
    if (this.viD != null) {
      paramJceOutputStream.write(this.viD, 1);
    }
    if (this.viE != null) {
      paramJceOutputStream.write(this.viE, 2);
    }
    if (this.viF != null) {
      paramJceOutputStream.write(this.viF, 3);
    }
    if (this.viG != 0L) {
      paramJceOutputStream.write(this.viG, 4);
    }
    if (this.viH != null) {
      paramJceOutputStream.write(this.viH, 5);
    }
    if (this.viI != 0) {
      paramJceOutputStream.write(this.viI, 6);
    }
    if (this.viJ != null) {
      paramJceOutputStream.write(this.viJ, 7);
    }
    if (this.viK != 0) {
      paramJceOutputStream.write(this.viK, 8);
    }
    if (this.viL != null) {
      paramJceOutputStream.write(this.viL, 9);
    }
    paramJceOutputStream.write(this.viM, 10);
    if (this.viN != 0) {
      paramJceOutputStream.write(this.viN, 11);
    }
    if (this.viO != 0) {
      paramJceOutputStream.write(this.viO, 12);
    }
    if (this.viP != null) {
      paramJceOutputStream.write(this.viP, 13);
    }
    if (this.viQ != 0) {
      paramJceOutputStream.write(this.viQ, 14);
    }
    paramJceOutputStream.write(this.viR, 15);
    if (this.viS != 0) {
      paramJceOutputStream.write(this.viS, 16);
    }
    paramJceOutputStream.write(this.viT, 17);
    if (this.viU != null) {
      paramJceOutputStream.write(this.viU, 18);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/c/c/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */