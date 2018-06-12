package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class aih
  extends bhp
{
  public LinkedList<ba> jSI = new LinkedList();
  public LinkedList<aky> jSm = new LinkedList();
  public int rLe;
  public LinkedList<bet> rLf = new LinkedList();
  public int rLg;
  public int rLh;
  public int rLi;
  public akx rLj;
  
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
      paramVarArgs.fT(2, this.rLe);
      paramVarArgs.d(3, 8, this.rLf);
      paramVarArgs.fT(4, this.rLg);
      paramVarArgs.fT(5, this.rLh);
      paramVarArgs.d(6, 8, this.jSI);
      paramVarArgs.fT(7, this.rLi);
      paramVarArgs.d(8, 8, this.jSm);
      if (this.rLj != null)
      {
        paramVarArgs.fV(9, this.rLj.boi());
        this.rLj.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1001;
      }
    }
    label1001:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rLe) + f.a.a.a.c(3, 8, this.rLf) + f.a.a.a.fQ(4, this.rLg) + f.a.a.a.fQ(5, this.rLh) + f.a.a.a.c(6, 8, this.jSI) + f.a.a.a.fQ(7, this.rLi) + f.a.a.a.c(8, 8, this.jSm);
      paramInt = i;
      if (this.rLj != null) {
        paramInt = i + f.a.a.a.fS(9, this.rLj.boi());
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rLf.clear();
        this.jSI.clear();
        this.jSm.clear();
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
        aih localaih = (aih)paramVarArgs[1];
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
            localaih.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaih.rLe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bet();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bet)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localaih.rLf.add(localObject1);
            paramInt += 1;
          }
        case 4: 
          localaih.rLg = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localaih.rLh = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ba();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ba)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localaih.jSI.add(localObject1);
            paramInt += 1;
          }
        case 7: 
          localaih.rLi = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new aky();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aky)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localaih.jSm.add(localObject1);
            paramInt += 1;
          }
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new akx();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((akx)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localaih.rLj = ((akx)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/aih.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */