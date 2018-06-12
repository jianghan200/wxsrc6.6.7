package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class qp
  extends bhd
{
  public int huV;
  public String kLf;
  public String rrW;
  public String rsa;
  public String ruV;
  public long ruW;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.ruV != null) {
        paramVarArgs.g(2, this.ruV);
      }
      paramVarArgs.T(3, this.ruW);
      if (this.rrW != null) {
        paramVarArgs.g(4, this.rrW);
      }
      if (this.rsa != null) {
        paramVarArgs.g(5, this.rsa);
      }
      paramVarArgs.fT(6, this.huV);
      if (this.kLf != null) {
        paramVarArgs.g(7, this.kLf);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label575;
      }
    }
    label575:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.ruV != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.ruV);
      }
      i += f.a.a.a.S(3, this.ruW);
      paramInt = i;
      if (this.rrW != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rrW);
      }
      i = paramInt;
      if (this.rsa != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rsa);
      }
      i += f.a.a.a.fQ(6, this.huV);
      paramInt = i;
      if (this.kLf != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.kLf);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        qp localqp = (qp)paramVarArgs[1];
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
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localqp.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localqp.ruV = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localqp.ruW = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 4: 
          localqp.rrW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localqp.rsa = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localqp.huV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localqp.kLf = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/qp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */