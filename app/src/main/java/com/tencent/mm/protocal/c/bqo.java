package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bqo
  extends com.tencent.mm.bk.a
{
  public int som;
  public int son;
  public int soo;
  public byx sop;
  public int soq;
  public int sor;
  public int sos;
  public int sot;
  public LinkedList<Integer> sou = new LinkedList();
  public int sov;
  public LinkedList<Integer> sow = new LinkedList();
  public int sox;
  public LinkedList<Integer> soy = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sop == null) {
        throw new f.a.a.b("Not all required fields were included: Addr");
      }
      paramVarArgs.fT(1, this.som);
      paramVarArgs.fT(2, this.son);
      paramVarArgs.fT(3, this.soo);
      if (this.sop != null)
      {
        paramVarArgs.fV(4, this.sop.boi());
        this.sop.a(paramVarArgs);
      }
      paramVarArgs.fT(5, this.soq);
      paramVarArgs.fT(6, this.sor);
      paramVarArgs.fT(7, this.sos);
      paramVarArgs.fT(8, this.sot);
      paramVarArgs.c(9, this.sou);
      paramVarArgs.fT(10, this.sov);
      paramVarArgs.c(11, this.sow);
      paramVarArgs.fT(12, this.sox);
      paramVarArgs.c(13, this.soy);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.som) + 0 + f.a.a.a.fQ(2, this.son) + f.a.a.a.fQ(3, this.soo);
      paramInt = i;
      if (this.sop != null) {
        paramInt = i + f.a.a.a.fS(4, this.sop.boi());
      }
      return paramInt + f.a.a.a.fQ(5, this.soq) + f.a.a.a.fQ(6, this.sor) + f.a.a.a.fQ(7, this.sos) + f.a.a.a.fQ(8, this.sot) + f.a.a.a.b(9, this.sou) + f.a.a.a.fQ(10, this.sov) + f.a.a.a.b(11, this.sow) + f.a.a.a.fQ(12, this.sox) + f.a.a.a.b(13, this.soy);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.sou.clear();
      this.sow.clear();
      this.soy.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.sop == null) {
        throw new f.a.a.b("Not all required fields were included: Addr");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      bqo localbqo = (bqo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localbqo.som = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 2: 
        localbqo.son = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        localbqo.soo = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new byx();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((byx)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localbqo.sop = ((byx)localObject1);
          paramInt += 1;
        }
        return 0;
      case 5: 
        localbqo.soq = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 6: 
        localbqo.sor = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 7: 
        localbqo.sos = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 8: 
        localbqo.sot = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 9: 
        localbqo.sou = new f.a.a.a.a(((f.a.a.a.a)localObject1).cJR().lR, unknownTagHandler).cJO();
        return 0;
      case 10: 
        localbqo.sov = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 11: 
        localbqo.sow = new f.a.a.a.a(((f.a.a.a.a)localObject1).cJR().lR, unknownTagHandler).cJO();
        return 0;
      case 12: 
        localbqo.sox = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      localbqo.soy = new f.a.a.a.a(((f.a.a.a.a)localObject1).cJR().lR, unknownTagHandler).cJO();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bqo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */