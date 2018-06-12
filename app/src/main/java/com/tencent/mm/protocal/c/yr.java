package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class yr
  extends bhp
{
  public LinkedList<com.tencent.mm.bk.b> rET = new LinkedList();
  public int rEU;
  public LinkedList<Integer> rEV = new LinkedList();
  public int rxy;
  
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
      paramVarArgs.d(2, 6, this.rET);
      paramVarArgs.fT(3, this.rEU);
      paramVarArgs.fT(4, this.rxy);
      paramVarArgs.d(5, 2, this.rEV);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label485;
      }
    }
    label485:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.c(2, 6, this.rET) + f.a.a.a.fQ(3, this.rEU) + f.a.a.a.fQ(4, this.rxy) + f.a.a.a.c(5, 2, this.rEV);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rET.clear();
        this.rEV.clear();
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
        yr localyr = (yr)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          int i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localyr.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localyr.rET.add(((f.a.a.a.a)localObject1).cJR());
          return 0;
        case 3: 
          localyr.rEU = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localyr.rxy = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localyr.rEV.add(Integer.valueOf(((f.a.a.a.a)localObject1).vHC.rY()));
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/yr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */