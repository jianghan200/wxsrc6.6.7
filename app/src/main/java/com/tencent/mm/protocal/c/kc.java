package com.tencent.mm.protocal.c;

public final class kc
  extends com.tencent.mm.bk.a
{
  public String bWP;
  public String title;
  public String url;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.url != null) {
        paramVarArgs.g(1, this.url);
      }
      if (this.title != null) {
        paramVarArgs.g(2, this.title);
      }
      if (this.bWP != null) {
        paramVarArgs.g(3, this.bWP);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.url == null) {
        break label289;
      }
    }
    label289:
    for (int i = f.a.a.b.b.a.h(1, this.url) + 0;; i = 0)
    {
      paramInt = i;
      if (this.title != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.title);
      }
      i = paramInt;
      if (this.bWP != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.bWP);
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
        kc localkc = (kc)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localkc.url = locala.vHC.readString();
          return 0;
        case 2: 
          localkc.title = locala.vHC.readString();
          return 0;
        }
        localkc.bWP = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/kc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */