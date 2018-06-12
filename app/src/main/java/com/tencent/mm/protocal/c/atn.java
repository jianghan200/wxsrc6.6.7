package com.tencent.mm.protocal.c;

public final class atn
  extends com.tencent.mm.bk.a
{
  public String dxh;
  public String hqp;
  public String url;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hqp != null) {
        paramVarArgs.g(1, this.hqp);
      }
      if (this.dxh != null) {
        paramVarArgs.g(2, this.dxh);
      }
      if (this.url != null) {
        paramVarArgs.g(4, this.url);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.hqp == null) {
        break label293;
      }
    }
    label293:
    for (int i = f.a.a.b.b.a.h(1, this.hqp) + 0;; i = 0)
    {
      paramInt = i;
      if (this.dxh != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.dxh);
      }
      i = paramInt;
      if (this.url != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.url);
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
        atn localatn = (atn)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        case 3: 
        default: 
          return -1;
        case 1: 
          localatn.hqp = locala.vHC.readString();
          return 0;
        case 2: 
          localatn.dxh = locala.vHC.readString();
          return 0;
        }
        localatn.url = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/atn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */