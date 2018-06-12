package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bes
  extends bhp
{
  public int hLg;
  public int qZc;
  public LinkedList<beq> rbQ = new LinkedList();
  public String rwj;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.rwj != null) {
        paramVarArgs.g(2, this.rwj);
      }
      paramVarArgs.fT(3, this.qZc);
      paramVarArgs.fT(4, this.hLg);
      paramVarArgs.d(5, 8, this.rbQ);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label567;
      }
    }
    label567:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rwj != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rwj);
      }
      return i + f.a.a.a.fQ(3, this.qZc) + f.a.a.a.fQ(4, this.hLg) + f.a.a.a.c(5, 8, this.rbQ);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rbQ.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six != null) {
          break;
        }
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bes localbes = (bes)paramVarArgs[1];
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
            localbes.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbes.rwj = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbes.qZc = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localbes.hLg = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new beq();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((beq)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localbes.rbQ.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/bes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */