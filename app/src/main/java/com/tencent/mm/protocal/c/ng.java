package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ng
  extends bhp
{
  public String eJK;
  public int rrl;
  public String rrm;
  public String rrn;
  
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
      if (this.eJK != null) {
        paramVarArgs.g(2, this.eJK);
      }
      paramVarArgs.fT(3, this.rrl);
      if (this.rrm != null) {
        paramVarArgs.g(4, this.rrm);
      }
      if (this.rrn != null) {
        paramVarArgs.g(5, this.rrn);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label509;
      }
    }
    label509:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.eJK != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.eJK);
      }
      i += f.a.a.a.fQ(3, this.rrl);
      paramInt = i;
      if (this.rrm != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rrm);
      }
      i = paramInt;
      if (this.rrn != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rrn);
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
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ng localng = (ng)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
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
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localng.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localng.eJK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localng.rrl = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localng.rrm = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localng.rrn = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/ng.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */