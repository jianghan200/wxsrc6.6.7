package com.tencent.mm.protocal.c;

public final class dk
  extends com.tencent.mm.bk.a
{
  public com.tencent.mm.bk.b rdG;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rdG == null) {
        throw new f.a.a.b("Not all required fields were included: Cookies");
      }
      if (this.rdG != null) {
        paramVarArgs.b(1, this.rdG);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rdG == null) {
        break label207;
      }
    }
    label207:
    for (paramInt = f.a.a.a.a(1, this.rdG) + 0;; paramInt = 0)
    {
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rdG != null) {
          break;
        }
        throw new f.a.a.b("Not all required fields were included: Cookies");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        dk localdk = (dk)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        }
        localdk.rdG = locala.cJR();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/dk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */