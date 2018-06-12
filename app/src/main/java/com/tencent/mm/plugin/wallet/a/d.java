package com.tencent.mm.plugin.wallet.a;

public final class d
  extends com.tencent.mm.bk.a
{
  public String dzE;
  public String name;
  public String pdR;
  public String url;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.url != null) {
        paramVarArgs.g(1, this.url);
      }
      if (this.name != null) {
        paramVarArgs.g(2, this.name);
      }
      if (this.pdR != null) {
        paramVarArgs.g(3, this.pdR);
      }
      if (this.dzE != null) {
        paramVarArgs.g(4, this.dzE);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.url == null) {
        break label344;
      }
    }
    label344:
    for (int i = f.a.a.b.b.a.h(1, this.url) + 0;; i = 0)
    {
      paramInt = i;
      if (this.name != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.name);
      }
      i = paramInt;
      if (this.pdR != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.pdR);
      }
      paramInt = i;
      if (this.dzE != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.dzE);
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
        d locald = (d)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          locald.url = locala.vHC.readString();
          return 0;
        case 2: 
          locald.name = locala.vHC.readString();
          return 0;
        case 3: 
          locald.pdR = locala.vHC.readString();
          return 0;
        }
        locald.dzE = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */