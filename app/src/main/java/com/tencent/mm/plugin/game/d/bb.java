package com.tencent.mm.plugin.game.d;

import com.tencent.mm.protocal.c.bhp;
import com.tencent.mm.protocal.c.fl;
import java.util.LinkedList;

public final class bb
  extends bhp
{
  public String jPB;
  public LinkedList<ac> jRH = new LinkedList();
  public com.tencent.mm.bk.b jRI;
  public boolean jRJ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new f.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.d(2, 8, this.jRH);
      if (this.jRI != null) {
        paramVarArgs.b(3, this.jRI);
      }
      paramVarArgs.av(4, this.jRJ);
      if (this.jPB != null) {
        paramVarArgs.g(5, this.jPB);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label581;
      }
    }
    label581:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.c(2, 8, this.jRH);
      paramInt = i;
      if (this.jRI != null) {
        paramInt = i + f.a.a.a.a(3, this.jRI);
      }
      i = paramInt + (f.a.a.b.b.a.ec(4) + 1);
      paramInt = i;
      if (this.jPB != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.jPB);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.jRH.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six != null) {
          break;
        }
        throw new f.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bb localbb = (bb)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbb.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ac();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ac)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbb.jRH.add(localObject1);
            paramInt += 1;
          }
        case 3: 
          localbb.jRI = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        case 4: 
          localbb.jRJ = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        }
        localbb.jPB = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/d/bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */