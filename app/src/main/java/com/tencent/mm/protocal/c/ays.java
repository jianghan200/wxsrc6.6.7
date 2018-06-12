package com.tencent.mm.protocal.c;

public class ays
  extends com.tencent.mm.bk.a
{
  public String eJI;
  public String eJJ;
  public String jPe;
  public String lCN;
  public double rji;
  public double rjj;
  public String ruY;
  public String ruZ;
  public String sbw;
  public String sbx;
  public String sby;
  public String sbz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jPe != null) {
        paramVarArgs.g(1, this.jPe);
      }
      if (this.sbw != null) {
        paramVarArgs.g(2, this.sbw);
      }
      paramVarArgs.c(3, this.rji);
      paramVarArgs.c(4, this.rjj);
      if (this.sbx != null) {
        paramVarArgs.g(5, this.sbx);
      }
      if (this.lCN != null) {
        paramVarArgs.g(6, this.lCN);
      }
      if (this.sby != null) {
        paramVarArgs.g(7, this.sby);
      }
      if (this.eJI != null) {
        paramVarArgs.g(8, this.eJI);
      }
      if (this.eJJ != null) {
        paramVarArgs.g(9, this.eJJ);
      }
      if (this.ruY != null) {
        paramVarArgs.g(10, this.ruY);
      }
      if (this.ruZ != null) {
        paramVarArgs.g(11, this.ruZ);
      }
      if (this.sbz != null) {
        paramVarArgs.g(12, this.sbz);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jPe == null) {
        break label760;
      }
    }
    label760:
    for (paramInt = f.a.a.b.b.a.h(1, this.jPe) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.sbw != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.sbw);
      }
      i = i + (f.a.a.b.b.a.ec(3) + 8) + (f.a.a.b.b.a.ec(4) + 8);
      paramInt = i;
      if (this.sbx != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.sbx);
      }
      i = paramInt;
      if (this.lCN != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.lCN);
      }
      paramInt = i;
      if (this.sby != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.sby);
      }
      i = paramInt;
      if (this.eJI != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.eJI);
      }
      paramInt = i;
      if (this.eJJ != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.eJJ);
      }
      i = paramInt;
      if (this.ruY != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.ruY);
      }
      paramInt = i;
      if (this.ruZ != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.ruZ);
      }
      i = paramInt;
      if (this.sbz != null) {
        i = paramInt + f.a.a.b.b.a.h(12, this.sbz);
      }
      return i;
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
        ays localays = (ays)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localays.jPe = locala.vHC.readString();
          return 0;
        case 2: 
          localays.sbw = locala.vHC.readString();
          return 0;
        case 3: 
          localays.rji = locala.vHC.readDouble();
          return 0;
        case 4: 
          localays.rjj = locala.vHC.readDouble();
          return 0;
        case 5: 
          localays.sbx = locala.vHC.readString();
          return 0;
        case 6: 
          localays.lCN = locala.vHC.readString();
          return 0;
        case 7: 
          localays.sby = locala.vHC.readString();
          return 0;
        case 8: 
          localays.eJI = locala.vHC.readString();
          return 0;
        case 9: 
          localays.eJJ = locala.vHC.readString();
          return 0;
        case 10: 
          localays.ruY = locala.vHC.readString();
          return 0;
        case 11: 
          localays.ruZ = locala.vHC.readString();
          return 0;
        }
        localays.sbz = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ays.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */