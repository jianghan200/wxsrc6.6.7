package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class vs
  extends bhp
{
  public int hLg;
  public LinkedList<vt> rbQ = new LinkedList();
  public String rvj;
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
      paramVarArgs.fT(3, this.hLg);
      paramVarArgs.d(4, 8, this.rbQ);
      if (this.rvj != null) {
        paramVarArgs.g(5, this.rvj);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label587;
      }
    }
    label587:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rwj != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rwj);
      }
      i = i + f.a.a.a.fQ(3, this.hLg) + f.a.a.a.c(4, 8, this.rbQ);
      paramInt = i;
      if (this.rvj != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rvj);
      }
      return paramInt;
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
        vs localvs = (vs)paramVarArgs[1];
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
            localvs.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localvs.rwj = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localvs.hLg = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new vt();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((vt)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localvs.rbQ.add(localObject1);
            paramInt += 1;
          }
        }
        localvs.rvj = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/vs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */