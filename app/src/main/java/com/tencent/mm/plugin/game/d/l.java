package com.tencent.mm.plugin.game.d;

import f.a.a.b;

public final class l
  extends com.tencent.mm.bk.a
{
  public String jPH;
  public String jPI;
  public String jPJ;
  public String jPK;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jPH == null) {
        throw new b("Not all required fields were included: Message");
      }
      if (this.jPI == null) {
        throw new b("Not all required fields were included: GotoBtn");
      }
      if (this.jPJ == null) {
        throw new b("Not all required fields were included: CancelBtn");
      }
      if (this.jPK == null) {
        throw new b("Not all required fields were included: Url");
      }
      if (this.jPH != null) {
        paramVarArgs.g(1, this.jPH);
      }
      if (this.jPI != null) {
        paramVarArgs.g(2, this.jPI);
      }
      if (this.jPJ != null) {
        paramVarArgs.g(3, this.jPJ);
      }
      if (this.jPK != null) {
        paramVarArgs.g(4, this.jPK);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jPH == null) {
        break label480;
      }
    }
    label480:
    for (int i = f.a.a.b.b.a.h(1, this.jPH) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jPI != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jPI);
      }
      i = paramInt;
      if (this.jPJ != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jPJ);
      }
      paramInt = i;
      if (this.jPK != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jPK);
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
        if (this.jPH == null) {
          throw new b("Not all required fields were included: Message");
        }
        if (this.jPI == null) {
          throw new b("Not all required fields were included: GotoBtn");
        }
        if (this.jPJ == null) {
          throw new b("Not all required fields were included: CancelBtn");
        }
        if (this.jPK != null) {
          break;
        }
        throw new b("Not all required fields were included: Url");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        l locall = (l)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          locall.jPH = locala.vHC.readString();
          return 0;
        case 2: 
          locall.jPI = locala.vHC.readString();
          return 0;
        case 3: 
          locall.jPJ = locala.vHC.readString();
          return 0;
        }
        locall.jPK = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/d/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */