package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class adn
  extends bhp
{
  public int rHV;
  public int rHW;
  public LinkedList<Integer> rHX = new LinkedList();
  public LinkedList<un> rHY = new LinkedList();
  public int rHZ;
  
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
      paramVarArgs.fT(2, this.rHV);
      paramVarArgs.fT(3, this.rHW);
      paramVarArgs.d(4, 2, this.rHX);
      paramVarArgs.d(5, 8, this.rHY);
      paramVarArgs.fT(6, this.rHZ);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label605;
      }
    }
    label605:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.rHV) + f.a.a.a.fQ(3, this.rHW) + f.a.a.a.c(4, 2, this.rHX) + f.a.a.a.c(5, 8, this.rHY) + f.a.a.a.fQ(6, this.rHZ);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rHX.clear();
        this.rHY.clear();
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
        adn localadn = (adn)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        int i;
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
            localadn.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localadn.rHV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localadn.rHW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localadn.rHX.add(Integer.valueOf(((f.a.a.a.a)localObject1).vHC.rY()));
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new un();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((un)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localadn.rHY.add(localObject1);
            paramInt += 1;
          }
        }
        localadn.rHZ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/adn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */