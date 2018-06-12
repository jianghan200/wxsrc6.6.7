package com.tencent.mm.plugin.luckymoney.b;

public final class d
  extends com.tencent.mm.bk.a
{
  public int hUw;
  public int kKQ;
  public double kKR;
  public double kKS;
  public double kKT;
  public double kKU;
  public String kKV;
  public String kKW;
  public String kPE;
  public String kPF;
  public int kPG;
  public String kPH;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.kKQ);
      paramVarArgs.c(2, this.kKT);
      if (this.kPE != null) {
        paramVarArgs.g(3, this.kPE);
      }
      if (this.kPF != null) {
        paramVarArgs.g(4, this.kPF);
      }
      paramVarArgs.c(5, this.kKR);
      paramVarArgs.c(6, this.kKU);
      paramVarArgs.c(7, this.kKS);
      paramVarArgs.fT(8, this.kPG);
      paramVarArgs.fT(9, this.hUw);
      if (this.kKV != null) {
        paramVarArgs.g(10, this.kKV);
      }
      if (this.kKW != null) {
        paramVarArgs.g(11, this.kKW);
      }
      if (this.kPH != null) {
        paramVarArgs.g(12, this.kPH);
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
      i = f.a.a.a.fQ(1, this.kKQ) + 0 + (f.a.a.b.b.a.ec(2) + 8);
      paramInt = i;
      if (this.kPE != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.kPE);
      }
      i = paramInt;
      if (this.kPF != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.kPF);
      }
      i = i + (f.a.a.b.b.a.ec(5) + 8) + (f.a.a.b.b.a.ec(6) + 8) + (f.a.a.b.b.a.ec(7) + 8) + f.a.a.a.fQ(8, this.kPG) + f.a.a.a.fQ(9, this.hUw);
      paramInt = i;
      if (this.kKV != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.kKV);
      }
      i = paramInt;
      if (this.kKW != null) {
        i = paramInt + f.a.a.b.b.a.h(11, this.kKW);
      }
      paramInt = i;
    } while (this.kPH == null);
    return i + f.a.a.b.b.a.h(12, this.kPH);
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
      d locald = (d)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        locald.kKQ = locala.vHC.rY();
        return 0;
      case 2: 
        locald.kKT = locala.vHC.readDouble();
        return 0;
      case 3: 
        locald.kPE = locala.vHC.readString();
        return 0;
      case 4: 
        locald.kPF = locala.vHC.readString();
        return 0;
      case 5: 
        locald.kKR = locala.vHC.readDouble();
        return 0;
      case 6: 
        locald.kKU = locala.vHC.readDouble();
        return 0;
      case 7: 
        locald.kKS = locala.vHC.readDouble();
        return 0;
      case 8: 
        locald.kPG = locala.vHC.rY();
        return 0;
      case 9: 
        locald.hUw = locala.vHC.rY();
        return 0;
      case 10: 
        locald.kKV = locala.vHC.readString();
        return 0;
      case 11: 
        locald.kKW = locala.vHC.readString();
        return 0;
      }
      locald.kPH = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */