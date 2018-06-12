package com.tencent.mm.protocal.c;

public final class bfr
  extends com.tencent.mm.bk.a
{
  public String bSc;
  public int number;
  public String type;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.type != null) {
        paramVarArgs.g(1, this.type);
      }
      if (this.bSc != null) {
        paramVarArgs.g(2, this.bSc);
      }
      paramVarArgs.fT(3, this.number);
      return 0;
    }
    if (paramInt == 1) {
      if (this.type == null) {
        break label269;
      }
    }
    label269:
    for (paramInt = f.a.a.b.b.a.h(1, this.type) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.bSc != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.bSc);
      }
      return i + f.a.a.a.fQ(3, this.number);
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
        bfr localbfr = (bfr)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbfr.type = locala.vHC.readString();
          return 0;
        case 2: 
          localbfr.bSc = locala.vHC.readString();
          return 0;
        }
        localbfr.number = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bfr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */