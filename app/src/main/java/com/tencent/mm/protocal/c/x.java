package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class x
  extends bhp
{
  public int hUm = 268513600;
  public String hUn = "请求不成功，请稍候再试";
  public String qYQ;
  public int qYR;
  public int qYS;
  public String qYT;
  public LinkedList<k> qYU = new LinkedList();
  public String qYV;
  
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
      paramVarArgs.fT(2, this.hUm);
      if (this.hUn != null) {
        paramVarArgs.g(3, this.hUn);
      }
      paramVarArgs.d(4, 8, this.qYU);
      if (this.qYV != null) {
        paramVarArgs.g(5, this.qYV);
      }
      if (this.qYQ != null) {
        paramVarArgs.g(6, this.qYQ);
      }
      paramVarArgs.fT(7, this.qYR);
      paramVarArgs.fT(8, this.qYS);
      if (this.qYT != null) {
        paramVarArgs.g(9, this.qYT);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label783;
      }
    }
    label783:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hUm);
      paramInt = i;
      if (this.hUn != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hUn);
      }
      i = paramInt + f.a.a.a.c(4, 8, this.qYU);
      paramInt = i;
      if (this.qYV != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.qYV);
      }
      i = paramInt;
      if (this.qYQ != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.qYQ);
      }
      i = i + f.a.a.a.fQ(7, this.qYR) + f.a.a.a.fQ(8, this.qYS);
      paramInt = i;
      if (this.qYT != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.qYT);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.qYU.clear();
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
        x localx = (x)paramVarArgs[1];
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
            localx.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localx.hUm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localx.hUn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new k();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((k)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localx.qYU.add(localObject1);
            paramInt += 1;
          }
        case 5: 
          localx.qYV = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localx.qYQ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localx.qYR = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localx.qYS = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localx.qYT = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */