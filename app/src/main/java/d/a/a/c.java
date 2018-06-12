package d.a.a;

import java.util.LinkedList;

public final class c
  extends com.tencent.mm.bk.a
{
  public String rvZ;
  public String rxR;
  public LinkedList<g> rxS = new LinkedList();
  public int rxT;
  public a rxU;
  public int vGZ;
  public int vHa;
  public int vHb;
  public e vHc;
  public String vHd;
  public b vHe;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.rxS);
      paramVarArgs.fT(2, this.vGZ);
      if (this.rvZ != null) {
        paramVarArgs.g(3, this.rvZ);
      }
      paramVarArgs.fT(4, this.rxT);
      if (this.rxU != null)
      {
        paramVarArgs.fV(5, this.rxU.boi());
        this.rxU.a(paramVarArgs);
      }
      if (this.rxR != null) {
        paramVarArgs.g(6, this.rxR);
      }
      paramVarArgs.fT(7, this.vHa);
      paramVarArgs.fT(8, this.vHb);
      if (this.vHc != null)
      {
        paramVarArgs.fV(9, this.vHc.boi());
        this.vHc.a(paramVarArgs);
      }
      if (this.vHd != null) {
        paramVarArgs.g(10, this.vHd);
      }
      if (this.vHe != null)
      {
        paramVarArgs.fV(11, this.vHe.boi());
        this.vHe.a(paramVarArgs);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.c(1, 8, this.rxS) + 0 + f.a.a.a.fQ(2, this.vGZ);
      paramInt = i;
      if (this.rvZ != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.rvZ);
      }
      i = paramInt + f.a.a.a.fQ(4, this.rxT);
      paramInt = i;
      if (this.rxU != null) {
        paramInt = i + f.a.a.a.fS(5, this.rxU.boi());
      }
      i = paramInt;
      if (this.rxR != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.rxR);
      }
      i = i + f.a.a.a.fQ(7, this.vHa) + f.a.a.a.fQ(8, this.vHb);
      paramInt = i;
      if (this.vHc != null) {
        paramInt = i + f.a.a.a.fS(9, this.vHc.boi());
      }
      i = paramInt;
      if (this.vHd != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.vHd);
      }
      paramInt = i;
    } while (this.vHe == null);
    return i + f.a.a.a.fS(11, this.vHe.boi());
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.rxS.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      c localc = (c)paramVarArgs[1];
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
          localObject1 = new g();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((g)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localc.rxS.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 2: 
        localc.vGZ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        localc.rvZ = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 4: 
        localc.rxT = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 5: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new a();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((a)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localc.rxU = ((a)localObject1);
          paramInt += 1;
        }
        return 0;
      case 6: 
        localc.rxR = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 7: 
        localc.vHa = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 8: 
        localc.vHb = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 9: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new e();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((e)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localc.vHc = ((e)localObject1);
          paramInt += 1;
        }
        return 0;
      case 10: 
        localc.vHd = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new b();
        localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((b)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
        localc.vHe = ((b)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/d/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */