package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;
import java.util.LinkedList;

public final class ob
  extends com.tencent.mm.bk.a
{
  public b rsl;
  public LinkedList<b> rsm = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rsl != null) {
        paramVarArgs.b(1, this.rsl);
      }
      paramVarArgs.d(2, 6, this.rsm);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rsl == null) {
        break label222;
      }
    }
    label222:
    for (paramInt = f.a.a.a.a(1, this.rsl) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.c(2, 6, this.rsm);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rsm.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        ob localob = (ob)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localob.rsl = locala.cJR();
          return 0;
        }
        localob.rsm.add(locala.cJR());
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ob.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */