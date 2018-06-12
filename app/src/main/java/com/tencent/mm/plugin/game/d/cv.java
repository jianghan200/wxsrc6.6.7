package com.tencent.mm.plugin.game.d;

import f.a.a.b;

public final class cv
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String jOS;
  public String jOT;
  public String jOU;
  public String jPA;
  public String jQb;
  public String jSv;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jSv == null) {
        throw new b("Not all required fields were included: AppName");
      }
      if (this.jSv != null) {
        paramVarArgs.g(1, this.jSv);
      }
      if (this.jOT != null) {
        paramVarArgs.g(2, this.jOT);
      }
      if (this.bHD != null) {
        paramVarArgs.g(3, this.bHD);
      }
      if (this.jOS != null) {
        paramVarArgs.g(4, this.jOS);
      }
      if (this.jPA != null) {
        paramVarArgs.g(5, this.jPA);
      }
      if (this.jOU != null) {
        paramVarArgs.g(6, this.jOU);
      }
      if (this.jQb != null) {
        paramVarArgs.g(7, this.jQb);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jSv == null) {
        break label545;
      }
    }
    label545:
    for (int i = f.a.a.b.b.a.h(1, this.jSv) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jOT != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jOT);
      }
      i = paramInt;
      if (this.bHD != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.bHD);
      }
      paramInt = i;
      if (this.jOS != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jOS);
      }
      i = paramInt;
      if (this.jPA != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.jPA);
      }
      paramInt = i;
      if (this.jOU != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.jOU);
      }
      i = paramInt;
      if (this.jQb != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.jQb);
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
        if (this.jSv != null) {
          break;
        }
        throw new b("Not all required fields were included: AppName");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        cv localcv = (cv)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcv.jSv = locala.vHC.readString();
          return 0;
        case 2: 
          localcv.jOT = locala.vHC.readString();
          return 0;
        case 3: 
          localcv.bHD = locala.vHC.readString();
          return 0;
        case 4: 
          localcv.jOS = locala.vHC.readString();
          return 0;
        case 5: 
          localcv.jPA = locala.vHC.readString();
          return 0;
        case 6: 
          localcv.jOU = locala.vHC.readString();
          return 0;
        }
        localcv.jQb = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/d/cv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */