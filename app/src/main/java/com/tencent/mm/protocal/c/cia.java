package com.tencent.mm.protocal.c;

import f.a.a.b;

public class cia
  extends com.tencent.mm.bk.a
{
  public String hbL;
  public String jPG;
  public String jQb;
  public String jQp;
  public String jSv;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jQb == null) {
        throw new b("Not all required fields were included: AppId");
      }
      if (this.jSv == null) {
        throw new b("Not all required fields were included: AppName");
      }
      if (this.hbL == null) {
        throw new b("Not all required fields were included: UserName");
      }
      if (this.jPG == null) {
        throw new b("Not all required fields were included: IconUrl");
      }
      if (this.jQb != null) {
        paramVarArgs.g(1, this.jQb);
      }
      if (this.jSv != null) {
        paramVarArgs.g(2, this.jSv);
      }
      if (this.hbL != null) {
        paramVarArgs.g(3, this.hbL);
      }
      if (this.jPG != null) {
        paramVarArgs.g(4, this.jPG);
      }
      if (this.jQp != null) {
        paramVarArgs.g(5, this.jQp);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jQb == null) {
        break label535;
      }
    }
    label535:
    for (int i = f.a.a.b.b.a.h(1, this.jQb) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jSv != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jSv);
      }
      i = paramInt;
      if (this.hbL != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.hbL);
      }
      paramInt = i;
      if (this.jPG != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jPG);
      }
      i = paramInt;
      if (this.jQp != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.jQp);
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
        if (this.jQb == null) {
          throw new b("Not all required fields were included: AppId");
        }
        if (this.jSv == null) {
          throw new b("Not all required fields were included: AppName");
        }
        if (this.hbL == null) {
          throw new b("Not all required fields were included: UserName");
        }
        if (this.jPG != null) {
          break;
        }
        throw new b("Not all required fields were included: IconUrl");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        cia localcia = (cia)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcia.jQb = locala.vHC.readString();
          return 0;
        case 2: 
          localcia.jSv = locala.vHC.readString();
          return 0;
        case 3: 
          localcia.hbL = locala.vHC.readString();
          return 0;
        case 4: 
          localcia.jPG = locala.vHC.readString();
          return 0;
        }
        localcia.jQp = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/cia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */