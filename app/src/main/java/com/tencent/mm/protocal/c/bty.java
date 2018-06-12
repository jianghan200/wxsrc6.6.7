package com.tencent.mm.protocal.c;

public final class bty
  extends com.tencent.mm.bk.a
{
  public String knE;
  public String lMV;
  public String muA;
  public String muB;
  public String muC;
  public String muD;
  public String mug;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.muA != null) {
        paramVarArgs.g(1, this.muA);
      }
      if (this.muB != null) {
        paramVarArgs.g(2, this.muB);
      }
      if (this.mug != null) {
        paramVarArgs.g(3, this.mug);
      }
      if (this.knE != null) {
        paramVarArgs.g(4, this.knE);
      }
      if (this.lMV != null) {
        paramVarArgs.g(5, this.lMV);
      }
      if (this.muC != null) {
        paramVarArgs.g(6, this.muC);
      }
      if (this.muD != null) {
        paramVarArgs.g(7, this.muD);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.muA == null) {
        break label513;
      }
    }
    label513:
    for (int i = f.a.a.b.b.a.h(1, this.muA) + 0;; i = 0)
    {
      paramInt = i;
      if (this.muB != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.muB);
      }
      i = paramInt;
      if (this.mug != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.mug);
      }
      paramInt = i;
      if (this.knE != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.knE);
      }
      i = paramInt;
      if (this.lMV != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.lMV);
      }
      paramInt = i;
      if (this.muC != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.muC);
      }
      i = paramInt;
      if (this.muD != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.muD);
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
        bty localbty = (bty)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbty.muA = locala.vHC.readString();
          return 0;
        case 2: 
          localbty.muB = locala.vHC.readString();
          return 0;
        case 3: 
          localbty.mug = locala.vHC.readString();
          return 0;
        case 4: 
          localbty.knE = locala.vHC.readString();
          return 0;
        case 5: 
          localbty.lMV = locala.vHC.readString();
          return 0;
        case 6: 
          localbty.muC = locala.vHC.readString();
          return 0;
        }
        localbty.muD = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bty.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */