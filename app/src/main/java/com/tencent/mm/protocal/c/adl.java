package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class adl
  extends bhp
{
  public com.tencent.mm.bk.b rHQ;
  public int rHR;
  public com.tencent.mm.bk.b rHS;
  
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
      paramVarArgs.fT(3, this.rHR);
      if (this.rHS != null) {
        paramVarArgs.b(4, this.rHS);
      }
      if (this.rHQ != null) {
        paramVarArgs.b(5, this.rHQ);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label452;
      }
    }
    label452:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(3, this.rHR);
      paramInt = i;
      if (this.rHS != null) {
        paramInt = i + f.a.a.a.a(4, this.rHS);
      }
      i = paramInt;
      if (this.rHQ != null) {
        i = paramInt + f.a.a.a.a(5, this.rHQ);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
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
        adl localadl = (adl)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        case 2: 
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localadl.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 3: 
          localadl.rHR = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localadl.rHS = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        }
        localadl.rHQ = ((f.a.a.a.a)localObject1).cJR();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/adl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */