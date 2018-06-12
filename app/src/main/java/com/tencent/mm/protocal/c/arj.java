package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;

public final class arj
  extends com.tencent.mm.bk.a
{
  public float biF;
  public String country;
  public String eJJ;
  public String kFa;
  public int nOB;
  public int nOD;
  public String nOz;
  public String rTG;
  public String rTH;
  public int rTI;
  public int rTJ;
  public b rTK;
  public String rTL;
  public float rmr;
  public float rms;
  public int score;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.l(1, this.rmr);
      paramVarArgs.l(2, this.rms);
      if (this.eJJ != null) {
        paramVarArgs.g(3, this.eJJ);
      }
      if (this.kFa != null) {
        paramVarArgs.g(4, this.kFa);
      }
      if (this.nOz != null) {
        paramVarArgs.g(5, this.nOz);
      }
      if (this.rTG != null) {
        paramVarArgs.g(6, this.rTG);
      }
      paramVarArgs.fT(7, this.nOB);
      if (this.rTH != null) {
        paramVarArgs.g(8, this.rTH);
      }
      paramVarArgs.fT(9, this.rTI);
      paramVarArgs.fT(10, this.rTJ);
      paramVarArgs.fT(11, this.nOD);
      paramVarArgs.l(12, this.biF);
      if (this.rTK != null) {
        paramVarArgs.b(13, this.rTK);
      }
      paramVarArgs.fT(14, this.score);
      if (this.rTL != null) {
        paramVarArgs.g(15, this.rTL);
      }
      if (this.country != null) {
        paramVarArgs.g(16, this.country);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.b.b.a.ec(1) + 4 + 0 + (f.a.a.b.b.a.ec(2) + 4);
      paramInt = i;
      if (this.eJJ != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.eJJ);
      }
      i = paramInt;
      if (this.kFa != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.kFa);
      }
      paramInt = i;
      if (this.nOz != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.nOz);
      }
      i = paramInt;
      if (this.rTG != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.rTG);
      }
      i += f.a.a.a.fQ(7, this.nOB);
      paramInt = i;
      if (this.rTH != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rTH);
      }
      i = paramInt + f.a.a.a.fQ(9, this.rTI) + f.a.a.a.fQ(10, this.rTJ) + f.a.a.a.fQ(11, this.nOD) + (f.a.a.b.b.a.ec(12) + 4);
      paramInt = i;
      if (this.rTK != null) {
        paramInt = i + f.a.a.a.a(13, this.rTK);
      }
      i = paramInt + f.a.a.a.fQ(14, this.score);
      paramInt = i;
      if (this.rTL != null) {
        paramInt = i + f.a.a.b.b.a.h(15, this.rTL);
      }
      i = paramInt;
    } while (this.country == null);
    return paramInt + f.a.a.b.b.a.h(16, this.country);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      arj localarj = (arj)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localarj.rmr = locala.vHC.readFloat();
        return 0;
      case 2: 
        localarj.rms = locala.vHC.readFloat();
        return 0;
      case 3: 
        localarj.eJJ = locala.vHC.readString();
        return 0;
      case 4: 
        localarj.kFa = locala.vHC.readString();
        return 0;
      case 5: 
        localarj.nOz = locala.vHC.readString();
        return 0;
      case 6: 
        localarj.rTG = locala.vHC.readString();
        return 0;
      case 7: 
        localarj.nOB = locala.vHC.rY();
        return 0;
      case 8: 
        localarj.rTH = locala.vHC.readString();
        return 0;
      case 9: 
        localarj.rTI = locala.vHC.rY();
        return 0;
      case 10: 
        localarj.rTJ = locala.vHC.rY();
        return 0;
      case 11: 
        localarj.nOD = locala.vHC.rY();
        return 0;
      case 12: 
        localarj.biF = locala.vHC.readFloat();
        return 0;
      case 13: 
        localarj.rTK = locala.cJR();
        return 0;
      case 14: 
        localarj.score = locala.vHC.rY();
        return 0;
      case 15: 
        localarj.rTL = locala.vHC.readString();
        return 0;
      }
      localarj.country = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/arj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */