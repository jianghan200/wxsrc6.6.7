package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class avn
  extends com.tencent.mm.bk.a
{
  public String content;
  public String lang;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.lang == null) {
        throw new b("Not all required fields were included: lang");
      }
      if (this.content == null) {
        throw new b("Not all required fields were included: content");
      }
      if (this.lang != null) {
        paramVarArgs.g(1, this.lang);
      }
      if (this.content != null) {
        paramVarArgs.g(2, this.content);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.lang == null) {
        break label302;
      }
    }
    label302:
    for (paramInt = f.a.a.b.b.a.h(1, this.lang) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.content != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.content);
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
        if (this.lang == null) {
          throw new b("Not all required fields were included: lang");
        }
        if (this.content != null) {
          break;
        }
        throw new b("Not all required fields were included: content");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        avn localavn = (avn)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localavn.lang = locala.vHC.readString();
          return 0;
        }
        localavn.content = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/avn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */