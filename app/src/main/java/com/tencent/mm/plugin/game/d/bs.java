package com.tencent.mm.plugin.game.d;

import f.a.a.b;

public final class bs
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String jOX;
  public String jQf;
  public String jSp;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jSp == null) {
        throw new b("Not all required fields were included: LogoURL");
      }
      if (this.bHD == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.jQf == null) {
        throw new b("Not all required fields were included: Detail");
      }
      if (this.jOX == null) {
        throw new b("Not all required fields were included: WebURL");
      }
      if (this.jSp != null) {
        paramVarArgs.g(1, this.jSp);
      }
      if (this.bHD != null) {
        paramVarArgs.g(2, this.bHD);
      }
      if (this.jQf != null) {
        paramVarArgs.g(3, this.jQf);
      }
      if (this.jOX != null) {
        paramVarArgs.g(4, this.jOX);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jSp == null) {
        break label480;
      }
    }
    label480:
    for (int i = f.a.a.b.b.a.h(1, this.jSp) + 0;; i = 0)
    {
      paramInt = i;
      if (this.bHD != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bHD);
      }
      i = paramInt;
      if (this.jQf != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jQf);
      }
      paramInt = i;
      if (this.jOX != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jOX);
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
        if (this.jSp == null) {
          throw new b("Not all required fields were included: LogoURL");
        }
        if (this.bHD == null) {
          throw new b("Not all required fields were included: Title");
        }
        if (this.jQf == null) {
          throw new b("Not all required fields were included: Detail");
        }
        if (this.jOX != null) {
          break;
        }
        throw new b("Not all required fields were included: WebURL");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        bs localbs = (bs)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbs.jSp = locala.vHC.readString();
          return 0;
        case 2: 
          localbs.bHD = locala.vHC.readString();
          return 0;
        case 3: 
          localbs.jQf = locala.vHC.readString();
          return 0;
        }
        localbs.jOX = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/game/d/bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */