package com.tencent.mm.plugin.game.d;

import f.a.a.b;
import java.util.LinkedList;

public final class aq
  extends com.tencent.mm.bk.a
{
  public LinkedList<String> jQY = new LinkedList();
  public String jQf;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jQf == null) {
        throw new b("Not all required fields were included: Detail");
      }
      if (this.jQf != null) {
        paramVarArgs.g(2, this.jQf);
      }
      paramVarArgs.d(3, 1, this.jQY);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jQf == null) {
        break label260;
      }
    }
    label260:
    for (paramInt = f.a.a.b.b.a.h(2, this.jQf) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.c(3, 1, this.jQY);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.jQY.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.jQf != null) {
          break;
        }
        throw new b("Not all required fields were included: Detail");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        aq localaq = (aq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 2: 
          localaq.jQf = locala.vHC.readString();
          return 0;
        }
        localaq.jQY.add(locala.vHC.readString());
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/d/aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */