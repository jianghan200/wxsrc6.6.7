package com.tencent.mm.protocal.c;

public final class ar
  extends com.tencent.mm.bk.a
{
  public String eJM;
  public String hbL;
  public String hcS;
  public int hcd;
  public String raA;
  public int raB;
  public int raC;
  public String raD;
  public int raE;
  public String raF;
  public String raG;
  public int raH;
  public String raI;
  public int ray;
  public String raz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hbL != null) {
        paramVarArgs.g(1, this.hbL);
      }
      if (this.hcS != null) {
        paramVarArgs.g(2, this.hcS);
      }
      paramVarArgs.fT(3, this.ray);
      if (this.raz != null) {
        paramVarArgs.g(4, this.raz);
      }
      if (this.raA != null) {
        paramVarArgs.g(5, this.raA);
      }
      if (this.eJM != null) {
        paramVarArgs.g(6, this.eJM);
      }
      paramVarArgs.fT(8, this.hcd);
      paramVarArgs.fT(9, this.raB);
      paramVarArgs.fT(10, this.raC);
      if (this.raD != null) {
        paramVarArgs.g(11, this.raD);
      }
      paramVarArgs.fT(12, this.raE);
      if (this.raF != null) {
        paramVarArgs.g(13, this.raF);
      }
      if (this.raG != null) {
        paramVarArgs.g(14, this.raG);
      }
      paramVarArgs.fT(15, this.raH);
      if (this.raI != null) {
        paramVarArgs.g(16, this.raI);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.hbL == null) {
        break label873;
      }
    }
    label873:
    for (paramInt = f.a.a.b.b.a.h(1, this.hbL) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.hcS != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.hcS);
      }
      i += f.a.a.a.fQ(3, this.ray);
      paramInt = i;
      if (this.raz != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.raz);
      }
      i = paramInt;
      if (this.raA != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.raA);
      }
      paramInt = i;
      if (this.eJM != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.eJM);
      }
      i = paramInt + f.a.a.a.fQ(8, this.hcd) + f.a.a.a.fQ(9, this.raB) + f.a.a.a.fQ(10, this.raC);
      paramInt = i;
      if (this.raD != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.raD);
      }
      i = paramInt + f.a.a.a.fQ(12, this.raE);
      paramInt = i;
      if (this.raF != null) {
        paramInt = i + f.a.a.b.b.a.h(13, this.raF);
      }
      i = paramInt;
      if (this.raG != null) {
        i = paramInt + f.a.a.b.b.a.h(14, this.raG);
      }
      i += f.a.a.a.fQ(15, this.raH);
      paramInt = i;
      if (this.raI != null) {
        paramInt = i + f.a.a.b.b.a.h(16, this.raI);
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
        ar localar = (ar)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        case 7: 
        default: 
          return -1;
        case 1: 
          localar.hbL = locala.vHC.readString();
          return 0;
        case 2: 
          localar.hcS = locala.vHC.readString();
          return 0;
        case 3: 
          localar.ray = locala.vHC.rY();
          return 0;
        case 4: 
          localar.raz = locala.vHC.readString();
          return 0;
        case 5: 
          localar.raA = locala.vHC.readString();
          return 0;
        case 6: 
          localar.eJM = locala.vHC.readString();
          return 0;
        case 8: 
          localar.hcd = locala.vHC.rY();
          return 0;
        case 9: 
          localar.raB = locala.vHC.rY();
          return 0;
        case 10: 
          localar.raC = locala.vHC.rY();
          return 0;
        case 11: 
          localar.raD = locala.vHC.readString();
          return 0;
        case 12: 
          localar.raE = locala.vHC.rY();
          return 0;
        case 13: 
          localar.raF = locala.vHC.readString();
          return 0;
        case 14: 
          localar.raG = locala.vHC.readString();
          return 0;
        case 15: 
          localar.raH = locala.vHC.rY();
          return 0;
        }
        localar.raI = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */