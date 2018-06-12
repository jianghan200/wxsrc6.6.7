package com.tencent.mm.protocal.c;

public final class bhr
  extends com.tencent.mm.bk.a
{
  public String jOU;
  public int jRb;
  public String siy;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.siy != null) {
        paramVarArgs.g(1, this.siy);
      }
      paramVarArgs.fT(2, this.jRb);
      if (this.jOU != null) {
        paramVarArgs.g(3, this.jOU);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.siy == null) {
        break label273;
      }
    }
    label273:
    for (paramInt = f.a.a.b.b.a.h(1, this.siy) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.jRb);
      paramInt = i;
      if (this.jOU != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.jOU);
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
        bhr localbhr = (bhr)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbhr.siy = locala.vHC.readString();
          return 0;
        case 2: 
          localbhr.jRb = locala.vHC.rY();
          return 0;
        }
        localbhr.jOU = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bhr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */