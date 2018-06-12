package com.tencent.mm.protocal.c;

public final class ts
  extends com.tencent.mm.bk.a
{
  public String jPG;
  public String rem;
  public String rwQ;
  public String rwR;
  public String rwS;
  public String rwT;
  public int rwU;
  public int rwV;
  public String rwY;
  public int rwZ;
  public String rxA;
  public String rxB;
  public String rxa;
  public String rxb;
  public String rxc;
  public String rxd;
  public String rxh;
  public int rxy;
  public String rxz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rem != null) {
        paramVarArgs.g(1, this.rem);
      }
      if (this.jPG != null) {
        paramVarArgs.g(2, this.jPG);
      }
      if (this.rwQ != null) {
        paramVarArgs.g(3, this.rwQ);
      }
      if (this.rwR != null) {
        paramVarArgs.g(4, this.rwR);
      }
      if (this.rwS != null) {
        paramVarArgs.g(5, this.rwS);
      }
      if (this.rwT != null) {
        paramVarArgs.g(6, this.rwT);
      }
      paramVarArgs.fT(7, this.rwU);
      paramVarArgs.fT(8, this.rwV);
      if (this.rwY != null) {
        paramVarArgs.g(9, this.rwY);
      }
      paramVarArgs.fT(10, this.rwZ);
      if (this.rxa != null) {
        paramVarArgs.g(11, this.rxa);
      }
      paramVarArgs.fT(12, this.rxy);
      if (this.rxd != null) {
        paramVarArgs.g(13, this.rxd);
      }
      if (this.rxb != null) {
        paramVarArgs.g(14, this.rxb);
      }
      if (this.rxc != null) {
        paramVarArgs.g(15, this.rxc);
      }
      if (this.rxz != null) {
        paramVarArgs.g(16, this.rxz);
      }
      if (this.rxh != null) {
        paramVarArgs.g(17, this.rxh);
      }
      if (this.rxA != null) {
        paramVarArgs.g(18, this.rxA);
      }
      if (this.rxB != null) {
        paramVarArgs.g(19, this.rxB);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rem == null) {
        break label1129;
      }
    }
    label1129:
    for (int i = f.a.a.b.b.a.h(1, this.rem) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jPG != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jPG);
      }
      i = paramInt;
      if (this.rwQ != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rwQ);
      }
      paramInt = i;
      if (this.rwR != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rwR);
      }
      i = paramInt;
      if (this.rwS != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rwS);
      }
      paramInt = i;
      if (this.rwT != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rwT);
      }
      i = paramInt + f.a.a.a.fQ(7, this.rwU) + f.a.a.a.fQ(8, this.rwV);
      paramInt = i;
      if (this.rwY != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.rwY);
      }
      i = paramInt + f.a.a.a.fQ(10, this.rwZ);
      paramInt = i;
      if (this.rxa != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.rxa);
      }
      i = paramInt + f.a.a.a.fQ(12, this.rxy);
      paramInt = i;
      if (this.rxd != null) {
        paramInt = i + f.a.a.b.b.a.h(13, this.rxd);
      }
      i = paramInt;
      if (this.rxb != null) {
        i = paramInt + f.a.a.b.b.a.h(14, this.rxb);
      }
      paramInt = i;
      if (this.rxc != null) {
        paramInt = i + f.a.a.b.b.a.h(15, this.rxc);
      }
      i = paramInt;
      if (this.rxz != null) {
        i = paramInt + f.a.a.b.b.a.h(16, this.rxz);
      }
      paramInt = i;
      if (this.rxh != null) {
        paramInt = i + f.a.a.b.b.a.h(17, this.rxh);
      }
      i = paramInt;
      if (this.rxA != null) {
        i = paramInt + f.a.a.b.b.a.h(18, this.rxA);
      }
      paramInt = i;
      if (this.rxB != null) {
        paramInt = i + f.a.a.b.b.a.h(19, this.rxB);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        ts localts = (ts)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localts.rem = locala.vHC.readString();
          return 0;
        case 2: 
          localts.jPG = locala.vHC.readString();
          return 0;
        case 3: 
          localts.rwQ = locala.vHC.readString();
          return 0;
        case 4: 
          localts.rwR = locala.vHC.readString();
          return 0;
        case 5: 
          localts.rwS = locala.vHC.readString();
          return 0;
        case 6: 
          localts.rwT = locala.vHC.readString();
          return 0;
        case 7: 
          localts.rwU = locala.vHC.rY();
          return 0;
        case 8: 
          localts.rwV = locala.vHC.rY();
          return 0;
        case 9: 
          localts.rwY = locala.vHC.readString();
          return 0;
        case 10: 
          localts.rwZ = locala.vHC.rY();
          return 0;
        case 11: 
          localts.rxa = locala.vHC.readString();
          return 0;
        case 12: 
          localts.rxy = locala.vHC.rY();
          return 0;
        case 13: 
          localts.rxd = locala.vHC.readString();
          return 0;
        case 14: 
          localts.rxb = locala.vHC.readString();
          return 0;
        case 15: 
          localts.rxc = locala.vHC.readString();
          return 0;
        case 16: 
          localts.rxz = locala.vHC.readString();
          return 0;
        case 17: 
          localts.rxh = locala.vHC.readString();
          return 0;
        case 18: 
          localts.rxA = locala.vHC.readString();
          return 0;
        }
        localts.rxB = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/ts.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */