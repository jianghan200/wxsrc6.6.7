package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class uw
  extends com.tencent.mm.bk.a
{
  public String rya;
  public String ryl;
  public LinkedList<String> rym = new LinkedList();
  public boolean ryn;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rya == null) {
        throw new b("Not all required fields were included: LoginUrl");
      }
      if (this.rya != null) {
        paramVarArgs.g(1, this.rya);
      }
      if (this.ryl != null) {
        paramVarArgs.g(2, this.ryl);
      }
      paramVarArgs.d(3, 1, this.rym);
      paramVarArgs.av(4, this.ryn);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rya == null) {
        break label349;
      }
    }
    label349:
    for (paramInt = f.a.a.b.b.a.h(1, this.rya) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.ryl != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.ryl);
      }
      return i + f.a.a.a.c(3, 1, this.rym) + (f.a.a.b.b.a.ec(4) + 1);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rym.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rya != null) {
          break;
        }
        throw new b("Not all required fields were included: LoginUrl");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        uw localuw = (uw)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localuw.rya = locala.vHC.readString();
          return 0;
        case 2: 
          localuw.ryl = locala.vHC.readString();
          return 0;
        case 3: 
          localuw.rym.add(locala.vHC.readString());
          return 0;
        }
        localuw.ryn = locala.cJQ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/uw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */