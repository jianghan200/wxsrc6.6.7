package com.tencent.mm.protocal.c;

public final class avz
  extends com.tencent.mm.bk.a
{
  public String hbL;
  public String hcS;
  public int iwE;
  public int rQA;
  public String rYV;
  public String rhg;
  public String rul;
  public int rxW;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.iwE);
      if (this.hcS != null) {
        paramVarArgs.g(2, this.hcS);
      }
      if (this.rhg != null) {
        paramVarArgs.g(3, this.rhg);
      }
      if (this.rul != null) {
        paramVarArgs.g(4, this.rul);
      }
      if (this.hbL != null) {
        paramVarArgs.g(5, this.hbL);
      }
      paramVarArgs.fT(6, this.rQA);
      paramVarArgs.fT(7, this.rxW);
      if (this.rYV != null) {
        paramVarArgs.g(8, this.rYV);
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
      i = f.a.a.a.fQ(1, this.iwE) + 0;
      paramInt = i;
      if (this.hcS != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.hcS);
      }
      i = paramInt;
      if (this.rhg != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rhg);
      }
      paramInt = i;
      if (this.rul != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rul);
      }
      i = paramInt;
      if (this.hbL != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.hbL);
      }
      i = i + f.a.a.a.fQ(6, this.rQA) + f.a.a.a.fQ(7, this.rxW);
      paramInt = i;
    } while (this.rYV == null);
    return i + f.a.a.b.b.a.h(8, this.rYV);
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
      avz localavz = (avz)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localavz.iwE = locala.vHC.rY();
        return 0;
      case 2: 
        localavz.hcS = locala.vHC.readString();
        return 0;
      case 3: 
        localavz.rhg = locala.vHC.readString();
        return 0;
      case 4: 
        localavz.rul = locala.vHC.readString();
        return 0;
      case 5: 
        localavz.hbL = locala.vHC.readString();
        return 0;
      case 6: 
        localavz.rQA = locala.vHC.rY();
        return 0;
      case 7: 
        localavz.rxW = locala.vHC.rY();
        return 0;
      }
      localavz.rYV = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/avz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */