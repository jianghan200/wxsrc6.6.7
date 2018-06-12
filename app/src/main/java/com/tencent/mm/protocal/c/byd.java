package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;
import java.util.LinkedList;

public final class byd
  extends bhd
{
  public String rKZ;
  public bhy rTr;
  public int rfe;
  public int suj;
  public LinkedList<byb> suk = new LinkedList();
  public int sul;
  public LinkedList<Integer> sum = new LinkedList();
  public int sun;
  public LinkedList<byc> suo = new LinkedList();
  
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
      paramVarArgs.fT(2, this.rfe);
      paramVarArgs.fT(3, this.suj);
      paramVarArgs.d(4, 8, this.suk);
      if (this.rKZ != null) {
        paramVarArgs.g(5, this.rKZ);
      }
      paramVarArgs.fT(6, this.sul);
      paramVarArgs.c(7, this.sum);
      paramVarArgs.fT(8, this.sun);
      paramVarArgs.d(9, 8, this.suo);
      if (this.rTr != null)
      {
        paramVarArgs.fV(10, this.rTr.boi());
        this.rTr.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label955;
      }
    }
    label955:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rfe) + f.a.a.a.fQ(3, this.suj) + f.a.a.a.c(4, 8, this.suk);
      paramInt = i;
      if (this.rKZ != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rKZ);
      }
      i = paramInt + f.a.a.a.fQ(6, this.sul) + f.a.a.a.b(7, this.sum) + f.a.a.a.fQ(8, this.sun) + f.a.a.a.c(9, 8, this.suo);
      paramInt = i;
      if (this.rTr != null) {
        paramInt = i + f.a.a.a.fS(10, this.rTr.boi());
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.suk.clear();
        this.sum.clear();
        this.suo.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        byd localbyd = (byd)paramVarArgs[1];
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
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbyd.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbyd.rfe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbyd.suj = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new byb();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((byb)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbyd.suk.add(localObject1);
            paramInt += 1;
          }
        case 5: 
          localbyd.rKZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbyd.sul = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbyd.sum = new f.a.a.a.a(((f.a.a.a.a)localObject1).cJR().lR, unknownTagHandler).cJO();
          return 0;
        case 8: 
          localbyd.sun = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new byc();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((byc)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbyd.suo.add(localObject1);
            paramInt += 1;
          }
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
          localbyd.rTr = ((bhy)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/byd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */