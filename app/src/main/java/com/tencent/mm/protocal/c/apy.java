package com.tencent.mm.protocal.c;

public final class apy
  extends com.tencent.mm.bk.a
{
  public int rSA;
  public String rjL;
  public String rjM;
  public String rjN;
  public String rjO;
  public String rjP;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rjL != null) {
        paramVarArgs.g(1, this.rjL);
      }
      if (this.rjM != null) {
        paramVarArgs.g(2, this.rjM);
      }
      if (this.rjN != null) {
        paramVarArgs.g(3, this.rjN);
      }
      if (this.rjO != null) {
        paramVarArgs.g(4, this.rjO);
      }
      if (this.rjP != null) {
        paramVarArgs.g(5, this.rjP);
      }
      paramVarArgs.fT(6, this.rSA);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rjL == null) {
        break label438;
      }
    }
    label438:
    for (int i = f.a.a.b.b.a.h(1, this.rjL) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rjM != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rjM);
      }
      i = paramInt;
      if (this.rjN != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rjN);
      }
      paramInt = i;
      if (this.rjO != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rjO);
      }
      i = paramInt;
      if (this.rjP != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rjP);
      }
      return i + f.a.a.a.fQ(6, this.rSA);
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
        apy localapy = (apy)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localapy.rjL = locala.vHC.readString();
          return 0;
        case 2: 
          localapy.rjM = locala.vHC.readString();
          return 0;
        case 3: 
          localapy.rjN = locala.vHC.readString();
          return 0;
        case 4: 
          localapy.rjO = locala.vHC.readString();
          return 0;
        case 5: 
          localapy.rjP = locala.vHC.readString();
          return 0;
        }
        localapy.rSA = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/apy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */