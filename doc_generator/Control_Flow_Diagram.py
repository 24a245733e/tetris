import graphviz as gv

class aDigraph(gv.Digraph):
    def expr(self, name):
        g1.node(name = name, shape='box')
    def cond(self, name):
        g1.node(name = name, shape='diamond')
    def module(self, name):
        g1.node(name = name, shape='parallelogram')
g1 = aDigraph(format='png')

s1 = 'Создать flame'
g1.expr(s1)
s2 = 'Создать Panel_left'
g1.expr(s2)

s3 = 'Создать KeyListener'
g1.expr(s3)
s3 = 'jopa'
g1.module(s3)
g1.edge(s1, s2)


g1.render(filename='Control_Flow_Diagram')
