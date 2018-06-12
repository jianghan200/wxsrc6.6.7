package com.tencent.mm.protocal.c;

public final class xc
  extends com.tencent.mm.bk.a
{
  public String rCA;
  public long rCB;
  public String rCC;
  public String rCD;
  public String rCE;
  public String rCF;
  public String rCG;
  public String rCH;
  public int rCI;
  public String rCJ;
  public int rCK;
  public long rCx;
  public long rCy;
  public long rCz;
  public String rqo;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.rCx);
      paramVarArgs.T(2, this.rCy);
      paramVarArgs.T(3, this.rCz);
      if (this.rCA != null) {
        paramVarArgs.g(4, this.rCA);
      }
      paramVarArgs.T(5, this.rCB);
      if (this.rCC != null) {
        paramVarArgs.g(6, this.rCC);
      }
      if (this.rCD != null) {
        paramVarArgs.g(7, this.rCD);
      }
      if (this.rCE != null) {
        paramVarArgs.g(8, this.rCE);
      }
      if (this.rCF != null) {
        paramVarArgs.g(9, this.rCF);
      }
      if (this.rCG != null) {
        paramVarArgs.g(10, this.rCG);
      }
      if (this.rCH != null) {
        paramVarArgs.g(11, this.rCH);
      }
      paramVarArgs.fT(12, this.rCI);
      if (this.rCJ != null) {
        paramVarArgs.g(13, this.rCJ);
      }
      paramVarArgs.fT(14, this.rCK);
      if (this.rqo != null) {
        paramVarArgs.g(15, this.rqo);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.S(1, this.rCx) + 0 + f.a.a.a.S(2, this.rCy) + f.a.a.a.S(3, this.rCz);
      paramInt = i;
      if (this.rCA != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rCA);
      }
      i = paramInt + f.a.a.a.S(5, this.rCB);
      paramInt = i;
      if (this.rCC != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rCC);
      }
      i = paramInt;
      if (this.rCD != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rCD);
      }
      paramInt = i;
      if (this.rCE != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rCE);
      }
      i = paramInt;
      if (this.rCF != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.rCF);
      }
      paramInt = i;
      if (this.rCG != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.rCG);
      }
      i = paramInt;
      if (this.rCH != null) {
        i = paramInt + f.a.a.b.b.a.h(11, this.rCH);
      }
      i += f.a.a.a.fQ(12, this.rCI);
      paramInt = i;
      if (this.rCJ != null) {
        paramInt = i + f.a.a.b.b.a.h(13, this.rCJ);
      }
      i = paramInt + f.a.a.a.fQ(14, this.rCK);
      paramInt = i;
    } while (this.rqo == null);
    return i + f.a.a.b.b.a.h(15, this.rqo);
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
      xc localxc = (xc)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localxc.rCx = locala.vHC.rZ();
        return 0;
      case 2: 
        localxc.rCy = locala.vHC.rZ();
        return 0;
      case 3: 
        localxc.rCz = locala.vHC.rZ();
        return 0;
      case 4: 
        localxc.rCA = locala.vHC.readString();
        return 0;
      case 5: 
        localxc.rCB = locala.vHC.rZ();
        return 0;
      case 6: 
        localxc.rCC = locala.vHC.readString();
        return 0;
      case 7: 
        localxc.rCD = locala.vHC.readString();
        return 0;
      case 8: 
        localxc.rCE = locala.vHC.readString();
        return 0;
      case 9: 
        localxc.rCF = locala.vHC.readString();
        return 0;
      case 10: 
        localxc.rCG = locala.vHC.readString();
        return 0;
      case 11: 
        localxc.rCH = locala.vHC.readString();
        return 0;
      case 12: 
        localxc.rCI = locala.vHC.rY();
        return 0;
      case 13: 
        localxc.rCJ = locala.vHC.readString();
        return 0;
      case 14: 
        localxc.rCK = locala.vHC.rY();
        return 0;
      }
      localxc.rqo = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/xc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */