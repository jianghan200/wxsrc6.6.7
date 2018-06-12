package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class m
  extends bhp
{
  public int hUm = 268513600;
  public String hUn = "请求不成功，请稍候再试";
  public String hUy;
  public String hUz;
  public int qYq;
  public int qYr;
  public int qYs;
  public long qYt;
  public long qYu;
  
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
      paramVarArgs.fT(4, this.qYq);
      paramVarArgs.fT(5, this.qYr);
      paramVarArgs.fT(6, this.qYs);
      paramVarArgs.T(7, this.qYt);
      paramVarArgs.T(8, this.qYu);
      if (this.hUy != null) {
        paramVarArgs.g(9, this.hUy);
      }
      if (this.hUz != null) {
        paramVarArgs.g(10, this.hUz);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label708;
      }
    }
    label708:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hUm);
      paramInt = i;
      if (this.hUn != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hUn);
      }
      i = paramInt + f.a.a.a.fQ(4, this.qYq) + f.a.a.a.fQ(5, this.qYr) + f.a.a.a.fQ(6, this.qYs) + f.a.a.a.S(7, this.qYt) + f.a.a.a.S(8, this.qYu);
      paramInt = i;
      if (this.hUy != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.hUy);
      }
      i = paramInt;
      if (this.hUz != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.hUz);
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
        m localm = (m)paramVarArgs[1];
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
            localm.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localm.hUm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localm.hUn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localm.qYq = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localm.qYr = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localm.qYs = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localm.qYt = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 8: 
          localm.qYu = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 9: 
          localm.hUy = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localm.hUz = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */