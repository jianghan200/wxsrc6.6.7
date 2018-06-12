package com.tencent.mm.protocal.c;

public final class byk
  extends com.tencent.mm.bk.a
{
  public String bJT;
  public String bPS;
  public String hFk;
  public String rQE;
  public String rQn;
  public String sus;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bPS != null) {
        paramVarArgs.g(1, this.bPS);
      }
      if (this.bJT != null) {
        paramVarArgs.g(2, this.bJT);
      }
      if (this.rQE != null) {
        paramVarArgs.g(3, this.rQE);
      }
      if (this.sus != null) {
        paramVarArgs.g(4, this.sus);
      }
      if (this.hFk != null) {
        paramVarArgs.g(5, this.hFk);
      }
      if (this.rQn != null) {
        paramVarArgs.g(6, this.rQn);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.bPS == null) {
        break label454;
      }
    }
    label454:
    for (int i = f.a.a.b.b.a.h(1, this.bPS) + 0;; i = 0)
    {
      paramInt = i;
      if (this.bJT != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bJT);
      }
      i = paramInt;
      if (this.rQE != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rQE);
      }
      paramInt = i;
      if (this.sus != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.sus);
      }
      i = paramInt;
      if (this.hFk != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.hFk);
      }
      paramInt = i;
      if (this.rQn != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rQn);
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
        byk localbyk = (byk)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbyk.bPS = locala.vHC.readString();
          return 0;
        case 2: 
          localbyk.bJT = locala.vHC.readString();
          return 0;
        case 3: 
          localbyk.rQE = locala.vHC.readString();
          return 0;
        case 4: 
          localbyk.sus = locala.vHC.readString();
          return 0;
        case 5: 
          localbyk.hFk = locala.vHC.readString();
          return 0;
        }
        localbyk.rQn = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/byk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */