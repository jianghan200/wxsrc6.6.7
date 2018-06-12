package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class abo
  extends bhp
{
  public LinkedList<String> htD = new LinkedList();
  public int htF;
  public int htG;
  public int htH;
  
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
      paramVarArgs.d(2, 1, this.htD);
      paramVarArgs.fT(3, this.htF);
      paramVarArgs.fT(4, this.htG);
      paramVarArgs.fT(5, this.htH);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label469;
      }
    }
    label469:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.c(2, 1, this.htD) + f.a.a.a.fQ(3, this.htF) + f.a.a.a.fQ(4, this.htG) + f.a.a.a.fQ(5, this.htH);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.htD.clear();
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
        abo localabo = (abo)paramVarArgs[1];
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
            localabo.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localabo.htD.add(((f.a.a.a.a)localObject1).vHC.readString());
          return 0;
        case 3: 
          localabo.htF = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localabo.htG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localabo.htH = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/abo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */